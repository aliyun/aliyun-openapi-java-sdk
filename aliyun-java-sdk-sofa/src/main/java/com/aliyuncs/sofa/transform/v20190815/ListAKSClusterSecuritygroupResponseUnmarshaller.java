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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListAKSClusterSecuritygroupResponse;
import com.aliyuncs.sofa.model.v20190815.ListAKSClusterSecuritygroupResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAKSClusterSecuritygroupResponseUnmarshaller {

	public static ListAKSClusterSecuritygroupResponse unmarshall(ListAKSClusterSecuritygroupResponse listAKSClusterSecuritygroupResponse, UnmarshallerContext _ctx) {
		
		listAKSClusterSecuritygroupResponse.setRequestId(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.RequestId"));
		listAKSClusterSecuritygroupResponse.setResultCode(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.ResultCode"));
		listAKSClusterSecuritygroupResponse.setResultMessage(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAKSClusterSecuritygroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIaasProviderId(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].IaasProviderId"));
			dataItem.setId(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].Name"));
			dataItem.setSecuredGroupIdentity(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].SecuredGroupIdentity"));
			dataItem.setSecuredZoneId(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].SecuredZoneId"));
			dataItem.setUtcCreate(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].UtcCreate"));
			dataItem.setUtcModified(_ctx.stringValue("ListAKSClusterSecuritygroupResponse.Data["+ i +"].UtcModified"));

			data.add(dataItem);
		}
		listAKSClusterSecuritygroupResponse.setData(data);
	 
	 	return listAKSClusterSecuritygroupResponse;
	}
}