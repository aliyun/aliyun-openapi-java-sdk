/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.drds.transform.v20190123;

import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse.Data;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse.Data.Full;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse.Data.FullCheck;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse.Data.FullRevise;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse.Data.Increment;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskInfoResponse.Data.Review;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardTaskInfoResponseUnmarshaller {

	public static DescribeShardTaskInfoResponse unmarshall(DescribeShardTaskInfoResponse describeShardTaskInfoResponse, UnmarshallerContext context) {
		
		describeShardTaskInfoResponse.setRequestId(context.stringValue("DescribeShardTaskInfoResponse.RequestId"));
		describeShardTaskInfoResponse.setSuccess(context.booleanValue("DescribeShardTaskInfoResponse.Success"));

		Data data = new Data();
		data.setSourceTableName(context.stringValue("DescribeShardTaskInfoResponse.Data.SourceTableName"));
		data.setTargetTableName(context.stringValue("DescribeShardTaskInfoResponse.Data.TargetTableName"));
		data.setStatus(context.stringValue("DescribeShardTaskInfoResponse.Data.Status"));
		data.setStage(context.stringValue("DescribeShardTaskInfoResponse.Data.Stage"));
		data.setProgress(context.stringValue("DescribeShardTaskInfoResponse.Data.Progress"));
		data.setExpired(context.stringValue("DescribeShardTaskInfoResponse.Data.Expired"));

		Full full = new Full();
		full.setExpired(context.integerValue("DescribeShardTaskInfoResponse.Data.Full.Expired"));
		full.setProgress(context.integerValue("DescribeShardTaskInfoResponse.Data.Full.Progress"));
		full.setTotal(context.integerValue("DescribeShardTaskInfoResponse.Data.Full.Total"));
		full.setTps(context.integerValue("DescribeShardTaskInfoResponse.Data.Full.Tps"));
		full.setStartTime(context.stringValue("DescribeShardTaskInfoResponse.Data.Full.StartTime"));
		data.setFull(full);

		FullCheck fullCheck = new FullCheck();
		fullCheck.setExpired(context.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Expired"));
		fullCheck.setProgress(context.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Progress"));
		fullCheck.setTotal(context.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Total"));
		fullCheck.setTps(context.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Tps"));
		fullCheck.setStartTime(context.stringValue("DescribeShardTaskInfoResponse.Data.FullCheck.StartTime"));
		data.setFullCheck(fullCheck);

		FullRevise fullRevise = new FullRevise();
		fullRevise.setExpired(context.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Expired"));
		fullRevise.setProgress(context.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Progress"));
		fullRevise.setTotal(context.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Total"));
		fullRevise.setTps(context.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Tps"));
		fullRevise.setStartTime(context.stringValue("DescribeShardTaskInfoResponse.Data.FullRevise.StartTime"));
		data.setFullRevise(fullRevise);

		Review review = new Review();
		review.setExpired(context.integerValue("DescribeShardTaskInfoResponse.Data.Review.Expired"));
		review.setProgress(context.integerValue("DescribeShardTaskInfoResponse.Data.Review.Progress"));
		review.setTotal(context.integerValue("DescribeShardTaskInfoResponse.Data.Review.Total"));
		review.setTps(context.integerValue("DescribeShardTaskInfoResponse.Data.Review.Tps"));
		review.setStartTime(context.stringValue("DescribeShardTaskInfoResponse.Data.Review.StartTime"));
		data.setReview(review);

		Increment increment = new Increment();
		increment.setDelay(context.integerValue("DescribeShardTaskInfoResponse.Data.Increment.Delay"));
		increment.setTps(context.integerValue("DescribeShardTaskInfoResponse.Data.Increment.Tps"));
		increment.setStartTime(context.stringValue("DescribeShardTaskInfoResponse.Data.Increment.StartTime"));
		data.setIncrement(increment);
		describeShardTaskInfoResponse.setData(data);
	 
	 	return describeShardTaskInfoResponse;
	}
}