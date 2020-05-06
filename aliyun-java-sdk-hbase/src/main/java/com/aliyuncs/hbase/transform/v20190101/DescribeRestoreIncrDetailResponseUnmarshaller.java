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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.DescribeRestoreIncrDetailResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreIncrDetailResponse.RestoreIncrDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreIncrDetailResponseUnmarshaller {

	public static DescribeRestoreIncrDetailResponse unmarshall(DescribeRestoreIncrDetailResponse describeRestoreIncrDetailResponse, UnmarshallerContext _ctx) {
		
		describeRestoreIncrDetailResponse.setRequestId(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RequestId"));

		RestoreIncrDetail restoreIncrDetail = new RestoreIncrDetail();
		restoreIncrDetail.setState(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.State"));
		restoreIncrDetail.setStartTime(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.StartTime"));
		restoreIncrDetail.setEndTime(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.EndTime"));
		restoreIncrDetail.setRestoreStartTs(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.RestoreStartTs"));
		restoreIncrDetail.setRestoredTs(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.RestoredTs"));
		restoreIncrDetail.setRestoreDelay(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.RestoreDelay"));
		restoreIncrDetail.setProcess(_ctx.stringValue("DescribeRestoreIncrDetailResponse.RestoreIncrDetail.Process"));
		describeRestoreIncrDetailResponse.setRestoreIncrDetail(restoreIncrDetail);
	 
	 	return describeRestoreIncrDetailResponse;
	}
}