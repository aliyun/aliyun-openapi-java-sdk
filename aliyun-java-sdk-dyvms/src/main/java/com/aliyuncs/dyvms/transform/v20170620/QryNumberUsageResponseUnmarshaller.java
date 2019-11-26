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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.QryNumberUsageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QryNumberUsageResponseUnmarshaller {

	public static QryNumberUsageResponse unmarshall(QryNumberUsageResponse qryNumberUsageResponse, UnmarshallerContext _ctx) {
		
		qryNumberUsageResponse.setRequestId(_ctx.stringValue("QryNumberUsageResponse.RequestId"));
		qryNumberUsageResponse.setCode(_ctx.stringValue("QryNumberUsageResponse.code"));
		qryNumberUsageResponse.setData(_ctx.stringValue("QryNumberUsageResponse.data"));
	 
	 	return qryNumberUsageResponse;
	}
}