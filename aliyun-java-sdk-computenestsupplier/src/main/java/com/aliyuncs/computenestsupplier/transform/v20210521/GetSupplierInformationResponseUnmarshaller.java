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

import com.aliyuncs.computenestsupplier.model.v20210521.GetSupplierInformationResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetSupplierInformationResponse.DeliverySettings;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupplierInformationResponseUnmarshaller {

	public static GetSupplierInformationResponse unmarshall(GetSupplierInformationResponse getSupplierInformationResponse, UnmarshallerContext _ctx) {
		
		getSupplierInformationResponse.setRequestId(_ctx.stringValue("GetSupplierInformationResponse.RequestId"));
		getSupplierInformationResponse.setSupplierName(_ctx.stringValue("GetSupplierInformationResponse.SupplierName"));
		getSupplierInformationResponse.setSupplierUrl(_ctx.stringValue("GetSupplierInformationResponse.SupplierUrl"));
		getSupplierInformationResponse.setSupplierDesc(_ctx.stringValue("GetSupplierInformationResponse.SupplierDesc"));
		getSupplierInformationResponse.setOperationIp(_ctx.stringValue("GetSupplierInformationResponse.OperationIp"));
		getSupplierInformationResponse.setOperationMfaPresent(_ctx.booleanValue("GetSupplierInformationResponse.OperationMfaPresent"));

		DeliverySettings deliverySettings = new DeliverySettings();
		deliverySettings.setOssEnabled(_ctx.booleanValue("GetSupplierInformationResponse.DeliverySettings.OssEnabled"));
		deliverySettings.setOssBucketName(_ctx.stringValue("GetSupplierInformationResponse.DeliverySettings.OssBucketName"));
		deliverySettings.setOssPath(_ctx.stringValue("GetSupplierInformationResponse.DeliverySettings.OssPath"));
		deliverySettings.setOssExpirationDays(_ctx.longValue("GetSupplierInformationResponse.DeliverySettings.OssExpirationDays"));
		getSupplierInformationResponse.setDeliverySettings(deliverySettings);
	 
	 	return getSupplierInformationResponse;
	}
}