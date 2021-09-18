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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import com.aliyuncs.computenestsupplier.model.v20210521.UpdateSupplierInformationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSupplierInformationResponseUnmarshaller {

	public static UpdateSupplierInformationResponse unmarshall(UpdateSupplierInformationResponse updateSupplierInformationResponse, UnmarshallerContext _ctx) {
		
		updateSupplierInformationResponse.setRequestId(_ctx.stringValue("UpdateSupplierInformationResponse.RequestId"));
		updateSupplierInformationResponse.setSupplierName(_ctx.stringValue("UpdateSupplierInformationResponse.SupplierName"));
		updateSupplierInformationResponse.setSupplierUrl(_ctx.stringValue("UpdateSupplierInformationResponse.SupplierUrl"));
		updateSupplierInformationResponse.setSupplierDesc(_ctx.stringValue("UpdateSupplierInformationResponse.SupplierDesc"));
	 
	 	return updateSupplierInformationResponse;
	}
}