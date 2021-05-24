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

package com.aliyuncs.dts.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dts.model.v20200101.DescribeDgDatabasesResponse;
import com.aliyuncs.dts.model.v20200101.DescribeDgDatabasesResponse.DgDatabasesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDgDatabasesResponseUnmarshaller {

	public static DescribeDgDatabasesResponse unmarshall(DescribeDgDatabasesResponse describeDgDatabasesResponse, UnmarshallerContext _ctx) {
		
		describeDgDatabasesResponse.setRequestId(_ctx.stringValue("DescribeDgDatabasesResponse.RequestId"));
		describeDgDatabasesResponse.setSuccess(_ctx.booleanValue("DescribeDgDatabasesResponse.Success"));
		describeDgDatabasesResponse.setErrCode(_ctx.stringValue("DescribeDgDatabasesResponse.ErrCode"));
		describeDgDatabasesResponse.setErrMessage(_ctx.stringValue("DescribeDgDatabasesResponse.ErrMessage"));
		describeDgDatabasesResponse.setDynamicCode(_ctx.stringValue("DescribeDgDatabasesResponse.DynamicCode"));
		describeDgDatabasesResponse.setDynamicMessage(_ctx.stringValue("DescribeDgDatabasesResponse.DynamicMessage"));
		describeDgDatabasesResponse.setHttpStatusCode(_ctx.integerValue("DescribeDgDatabasesResponse.HttpStatusCode"));

		List<DgDatabasesItem> dgDatabases = new ArrayList<DgDatabasesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDgDatabasesResponse.DgDatabases.Length"); i++) {
			DgDatabasesItem dgDatabasesItem = new DgDatabasesItem();
			dgDatabasesItem.setInstanceId(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].InstanceId"));
			dgDatabasesItem.setInstanceName(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].InstanceName"));
			dgDatabasesItem.setRegion(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].Region"));
			dgDatabasesItem.setEngine(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].Engine"));
			dgDatabasesItem.setVpcId(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].VpcId"));
			dgDatabasesItem.setVpcCloudInstanceId(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].VpcCloudInstanceId"));
			dgDatabasesItem.setStatus(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].Status"));
			dgDatabasesItem.setGroupId(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].GroupId"));
			dgDatabasesItem.setHostPort(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].HostPort"));
			dgDatabasesItem.setConnectHostPort(_ctx.stringValue("DescribeDgDatabasesResponse.DgDatabases["+ i +"].ConnectHostPort"));

			dgDatabases.add(dgDatabasesItem);
		}
		describeDgDatabasesResponse.setDgDatabases(dgDatabases);
	 
	 	return describeDgDatabasesResponse;
	}
}