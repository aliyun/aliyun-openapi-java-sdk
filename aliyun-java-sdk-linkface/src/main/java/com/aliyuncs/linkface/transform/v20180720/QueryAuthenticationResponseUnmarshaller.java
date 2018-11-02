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

package com.aliyuncs.linkface.transform.v20180720;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkface.model.v20180720.QueryAuthenticationResponse;
import com.aliyuncs.linkface.model.v20180720.QueryAuthenticationResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAuthenticationResponseUnmarshaller {

	public static QueryAuthenticationResponse unmarshall(QueryAuthenticationResponse queryAuthenticationResponse, UnmarshallerContext context) {
		
		queryAuthenticationResponse.setRequestId(context.stringValue("QueryAuthenticationResponse.RequestId"));
		queryAuthenticationResponse.setCode(context.integerValue("QueryAuthenticationResponse.Code"));
		queryAuthenticationResponse.setMessage(context.stringValue("QueryAuthenticationResponse.Message"));
		queryAuthenticationResponse.setPageCount(context.integerValue("QueryAuthenticationResponse.PageCount"));
		queryAuthenticationResponse.setPageSize(context.integerValue("QueryAuthenticationResponse.PageSize"));
		queryAuthenticationResponse.setPage(context.integerValue("QueryAuthenticationResponse.Page"));
		queryAuthenticationResponse.setTotal(context.integerValue("QueryAuthenticationResponse.Total"));
		queryAuthenticationResponse.setSuccess(context.booleanValue("QueryAuthenticationResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("QueryAuthenticationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLicenseType(context.integerValue("QueryAuthenticationResponse.Data["+ i +"].LicenseType"));
			dataItem.setIotId(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].IotId"));
			dataItem.setBeginTime(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].BeginTime"));
			dataItem.setExpiredTime(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].ExpiredTime"));
			dataItem.setApkPubkey(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].ApkPubkey"));
			dataItem.setPackageName(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].PackageName"));
			dataItem.setClientId(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].ClientId"));
			dataItem.setProductKey(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].ProductKey"));
			dataItem.setDeviceName(context.stringValue("QueryAuthenticationResponse.Data["+ i +"].DeviceName"));

			data.add(dataItem);
		}
		queryAuthenticationResponse.setData(data);
	 
	 	return queryAuthenticationResponse;
	}
}