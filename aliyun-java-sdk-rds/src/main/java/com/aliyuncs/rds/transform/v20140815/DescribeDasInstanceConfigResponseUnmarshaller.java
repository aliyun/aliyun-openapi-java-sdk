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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeDasInstanceConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDasInstanceConfigResponseUnmarshaller {

	public static DescribeDasInstanceConfigResponse unmarshall(DescribeDasInstanceConfigResponse describeDasInstanceConfigResponse, UnmarshallerContext _ctx) {
		
		describeDasInstanceConfigResponse.setRequestId(_ctx.stringValue("DescribeDasInstanceConfigResponse.RequestId"));
		describeDasInstanceConfigResponse.setData(_ctx.stringValue("DescribeDasInstanceConfigResponse.Data"));
		describeDasInstanceConfigResponse.setStorageUpperBound(_ctx.integerValue("DescribeDasInstanceConfigResponse.StorageUpperBound"));
		describeDasInstanceConfigResponse.setMaxStorageUpperBound(_ctx.integerValue("DescribeDasInstanceConfigResponse.MaxStorageUpperBound"));
		describeDasInstanceConfigResponse.setDBInstanceId(_ctx.stringValue("DescribeDasInstanceConfigResponse.DBInstanceId"));
		describeDasInstanceConfigResponse.setStorageThreshold(_ctx.integerValue("DescribeDasInstanceConfigResponse.StorageThreshold"));
		describeDasInstanceConfigResponse.setStorageAutoScale(_ctx.booleanValue("DescribeDasInstanceConfigResponse.StorageAutoScale"));
		describeDasInstanceConfigResponse.setDBType(_ctx.stringValue("DescribeDasInstanceConfigResponse.DBType"));
	 
	 	return describeDasInstanceConfigResponse;
	}
}