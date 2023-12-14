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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantEncryptionResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantEncryptionResponse.TenantEncryptionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantEncryptionResponseUnmarshaller {

	public static DescribeTenantEncryptionResponse unmarshall(DescribeTenantEncryptionResponse describeTenantEncryptionResponse, UnmarshallerContext _ctx) {
		
		describeTenantEncryptionResponse.setRequestId(_ctx.stringValue("DescribeTenantEncryptionResponse.RequestId"));
		describeTenantEncryptionResponse.setTotalCount(_ctx.integerValue("DescribeTenantEncryptionResponse.TotalCount"));

		List<TenantEncryptionsItem> tenantEncryptions = new ArrayList<TenantEncryptionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantEncryptionResponse.TenantEncryptions.Length"); i++) {
			TenantEncryptionsItem tenantEncryptionsItem = new TenantEncryptionsItem();
			tenantEncryptionsItem.setTenantId(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].TenantId"));
			tenantEncryptionsItem.setTenantMode(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].TenantMode"));
			tenantEncryptionsItem.setTenantName(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].TenantName"));
			tenantEncryptionsItem.setEnableEncryption(_ctx.booleanValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].EnableEncryption"));
			tenantEncryptionsItem.setTenantStatus(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].TenantStatus"));
			tenantEncryptionsItem.setStatus(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].Status"));
			tenantEncryptionsItem.setEncryptionType(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].EncryptionType"));
			tenantEncryptionsItem.setEncryptionKeyId(_ctx.stringValue("DescribeTenantEncryptionResponse.TenantEncryptions["+ i +"].EncryptionKeyId"));

			tenantEncryptions.add(tenantEncryptionsItem);
		}
		describeTenantEncryptionResponse.setTenantEncryptions(tenantEncryptions);
	 
	 	return describeTenantEncryptionResponse;
	}
}