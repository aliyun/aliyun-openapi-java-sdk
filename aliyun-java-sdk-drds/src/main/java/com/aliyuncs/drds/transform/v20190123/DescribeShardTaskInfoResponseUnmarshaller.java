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

	public static DescribeShardTaskInfoResponse unmarshall(DescribeShardTaskInfoResponse describeShardTaskInfoResponse, UnmarshallerContext _ctx) {
		
		describeShardTaskInfoResponse.setRequestId(_ctx.stringValue("DescribeShardTaskInfoResponse.RequestId"));
		describeShardTaskInfoResponse.setSuccess(_ctx.booleanValue("DescribeShardTaskInfoResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Status"));
		data.setStage(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Stage"));
		data.setProgress(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Progress"));
		data.setExpired(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Expired"));
		data.setTargetTableName(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.TargetTableName"));
		data.setSourceTableName(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.SourceTableName"));

		Full full = new Full();
		full.setStartTime(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Full.StartTime"));
		full.setProgress(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Full.Progress"));
		full.setTps(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Full.Tps"));
		full.setTotal(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Full.Total"));
		full.setExpired(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Full.Expired"));
		data.setFull(full);

		FullCheck fullCheck = new FullCheck();
		fullCheck.setStartTime(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.FullCheck.StartTime"));
		fullCheck.setProgress(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Progress"));
		fullCheck.setTps(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Tps"));
		fullCheck.setTotal(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Total"));
		fullCheck.setExpired(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullCheck.Expired"));
		data.setFullCheck(fullCheck);

		FullRevise fullRevise = new FullRevise();
		fullRevise.setStartTime(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.FullRevise.StartTime"));
		fullRevise.setProgress(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Progress"));
		fullRevise.setTps(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Tps"));
		fullRevise.setTotal(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Total"));
		fullRevise.setExpired(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.FullRevise.Expired"));
		data.setFullRevise(fullRevise);

		Review review = new Review();
		review.setStartTime(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Review.StartTime"));
		review.setProgress(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Review.Progress"));
		review.setTps(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Review.Tps"));
		review.setTotal(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Review.Total"));
		review.setExpired(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Review.Expired"));
		data.setReview(review);

		Increment increment = new Increment();
		increment.setDelay(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Increment.Delay"));
		increment.setStartTime(_ctx.stringValue("DescribeShardTaskInfoResponse.Data.Increment.StartTime"));
		increment.setTps(_ctx.integerValue("DescribeShardTaskInfoResponse.Data.Increment.Tps"));
		data.setIncrement(increment);
		describeShardTaskInfoResponse.setData(data);
	 
	 	return describeShardTaskInfoResponse;
	}
}