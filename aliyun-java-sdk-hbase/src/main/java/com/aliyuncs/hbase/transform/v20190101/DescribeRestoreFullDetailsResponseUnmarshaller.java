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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeRestoreFullDetailsResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreFullDetailsResponse.RestoreFull;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreFullDetailsResponseUnmarshaller {

	public static DescribeRestoreFullDetailsResponse unmarshall(DescribeRestoreFullDetailsResponse describeRestoreFullDetailsResponse, UnmarshallerContext _ctx) {
		
		describeRestoreFullDetailsResponse.setRequestId(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RequestId"));

		RestoreFull restoreFull = new RestoreFull();
		restoreFull.setSucceed(_ctx.integerValue("DescribeRestoreFullDetailsResponse.RestoreFull.Succeed"));
		restoreFull.setFail(_ctx.integerValue("DescribeRestoreFullDetailsResponse.RestoreFull.Fail"));
		restoreFull.setDataSize(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.DataSize"));
		restoreFull.setSpeed(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.Speed"));
		restoreFull.setTotal(_ctx.longValue("DescribeRestoreFullDetailsResponse.RestoreFull.Total"));
		restoreFull.setPageNumber(_ctx.integerValue("DescribeRestoreFullDetailsResponse.RestoreFull.PageNumber"));
		restoreFull.setPageSize(_ctx.integerValue("DescribeRestoreFullDetailsResponse.RestoreFull.PageSize"));

		List<RestoreFullDetail> restoreFullDetails = new ArrayList<RestoreFullDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails.Length"); i++) {
			RestoreFullDetail restoreFullDetail = new RestoreFullDetail();
			restoreFullDetail.setTable(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].Table"));
			restoreFullDetail.setState(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].State"));
			restoreFullDetail.setStartTime(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].StartTime"));
			restoreFullDetail.setEndTime(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].EndTime"));
			restoreFullDetail.setProcess(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].Process"));
			restoreFullDetail.setDataSize(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].DataSize"));
			restoreFullDetail.setSpeed(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].Speed"));
			restoreFullDetail.setMessage(_ctx.stringValue("DescribeRestoreFullDetailsResponse.RestoreFull.RestoreFullDetails["+ i +"].Message"));

			restoreFullDetails.add(restoreFullDetail);
		}
		restoreFull.setRestoreFullDetails(restoreFullDetails);
		describeRestoreFullDetailsResponse.setRestoreFull(restoreFull);
	 
	 	return describeRestoreFullDetailsResponse;
	}
}