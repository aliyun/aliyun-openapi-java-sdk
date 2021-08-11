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

package com.aliyuncs.push.transform.v20160801;

import com.aliyuncs.push.model.v20160801.CheckCertificateResponse;
import com.aliyuncs.push.model.v20160801.CheckCertificateResponse.DevelopmentCertInfo;
import com.aliyuncs.push.model.v20160801.CheckCertificateResponse.ProductionCertInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckCertificateResponseUnmarshaller {

	public static CheckCertificateResponse unmarshall(CheckCertificateResponse checkCertificateResponse, UnmarshallerContext _ctx) {
		
		checkCertificateResponse.setRequestId(_ctx.stringValue("CheckCertificateResponse.RequestId"));
		checkCertificateResponse.setAndroid(_ctx.booleanValue("CheckCertificateResponse.Android"));
		checkCertificateResponse.setIOS(_ctx.booleanValue("CheckCertificateResponse.IOS"));

		ProductionCertInfo productionCertInfo = new ProductionCertInfo();
		productionCertInfo.setExipreTime(_ctx.longValue("CheckCertificateResponse.ProductionCertInfo.ExipreTime"));
		productionCertInfo.setStatus(_ctx.stringValue("CheckCertificateResponse.ProductionCertInfo.Status"));
		checkCertificateResponse.setProductionCertInfo(productionCertInfo);

		DevelopmentCertInfo developmentCertInfo = new DevelopmentCertInfo();
		developmentCertInfo.setExipreTime(_ctx.longValue("CheckCertificateResponse.DevelopmentCertInfo.ExipreTime"));
		developmentCertInfo.setStatus(_ctx.stringValue("CheckCertificateResponse.DevelopmentCertInfo.Status"));
		checkCertificateResponse.setDevelopmentCertInfo(developmentCertInfo);
	 
	 	return checkCertificateResponse;
	}
}