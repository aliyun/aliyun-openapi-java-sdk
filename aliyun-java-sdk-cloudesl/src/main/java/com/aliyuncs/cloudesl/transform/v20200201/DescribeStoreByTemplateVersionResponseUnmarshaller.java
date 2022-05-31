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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreByTemplateVersionResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeStoreByTemplateVersionResponse.SelectItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoreByTemplateVersionResponseUnmarshaller {

	public static DescribeStoreByTemplateVersionResponse unmarshall(DescribeStoreByTemplateVersionResponse describeStoreByTemplateVersionResponse, UnmarshallerContext _ctx) {
		
		describeStoreByTemplateVersionResponse.setRequestId(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.RequestId"));
		describeStoreByTemplateVersionResponse.setErrorMessage(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.ErrorMessage"));
		describeStoreByTemplateVersionResponse.setSuccess(_ctx.booleanValue("DescribeStoreByTemplateVersionResponse.Success"));
		describeStoreByTemplateVersionResponse.setErrorCode(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.ErrorCode"));
		describeStoreByTemplateVersionResponse.setCode(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Code"));
		describeStoreByTemplateVersionResponse.setMessage(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Message"));
		describeStoreByTemplateVersionResponse.setDynamicMessage(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.DynamicMessage"));
		describeStoreByTemplateVersionResponse.setDynamicCode(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.DynamicCode"));

		List<SelectItemInfo> stores = new ArrayList<SelectItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoreByTemplateVersionResponse.Stores.Length"); i++) {
			SelectItemInfo selectItemInfo = new SelectItemInfo();
			selectItemInfo.setStoreName(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].StoreName"));
			selectItemInfo.setStoreId(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].StoreId"));
			selectItemInfo.setParentId(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].ParentId"));
			selectItemInfo.setUserStoreCode(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].UserStoreCode"));
			selectItemInfo.setGmtModified(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].GmtModified"));
			selectItemInfo.setPhone(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].Phone"));
			selectItemInfo.setLevel(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].Level"));
			selectItemInfo.setTemplateVersion(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].TemplateVersion"));
			selectItemInfo.setTimeZone(_ctx.stringValue("DescribeStoreByTemplateVersionResponse.Stores["+ i +"].TimeZone"));

			stores.add(selectItemInfo);
		}
		describeStoreByTemplateVersionResponse.setStores(stores);
	 
	 	return describeStoreByTemplateVersionResponse;
	}
}