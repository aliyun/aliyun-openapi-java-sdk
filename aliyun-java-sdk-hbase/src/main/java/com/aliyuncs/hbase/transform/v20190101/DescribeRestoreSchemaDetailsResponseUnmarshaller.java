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

import com.aliyuncs.hbase.model.v20190101.DescribeRestoreSchemaDetailsResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreSchemaDetailsResponse.RestoreSchema;
import com.aliyuncs.hbase.model.v20190101.DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreSchemaDetailsResponseUnmarshaller {

	public static DescribeRestoreSchemaDetailsResponse unmarshall(DescribeRestoreSchemaDetailsResponse describeRestoreSchemaDetailsResponse, UnmarshallerContext _ctx) {
		
		describeRestoreSchemaDetailsResponse.setRequestId(_ctx.stringValue("DescribeRestoreSchemaDetailsResponse.RequestId"));

		RestoreSchema restoreSchema = new RestoreSchema();
		restoreSchema.setSucceed(_ctx.integerValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.Succeed"));
		restoreSchema.setFail(_ctx.integerValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.Fail"));
		restoreSchema.setTotal(_ctx.longValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.Total"));
		restoreSchema.setPageNumber(_ctx.integerValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.PageNumber"));
		restoreSchema.setPageSize(_ctx.integerValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.PageSize"));

		List<RestoreSchemaDetail> restoreSchemaDetails = new ArrayList<RestoreSchemaDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetails.Length"); i++) {
			RestoreSchemaDetail restoreSchemaDetail = new RestoreSchemaDetail();
			restoreSchemaDetail.setTable(_ctx.stringValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].Table"));
			restoreSchemaDetail.setStartTime(_ctx.stringValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].StartTime"));
			restoreSchemaDetail.setEndTime(_ctx.stringValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].EndTime"));
			restoreSchemaDetail.setState(_ctx.stringValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].State"));
			restoreSchemaDetail.setMessage(_ctx.stringValue("DescribeRestoreSchemaDetailsResponse.RestoreSchema.RestoreSchemaDetails["+ i +"].Message"));

			restoreSchemaDetails.add(restoreSchemaDetail);
		}
		restoreSchema.setRestoreSchemaDetails(restoreSchemaDetails);
		describeRestoreSchemaDetailsResponse.setRestoreSchema(restoreSchema);
	 
	 	return describeRestoreSchemaDetailsResponse;
	}
}