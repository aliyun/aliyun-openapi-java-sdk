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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.InnerAntInstanceConvertToPrepaidResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerAntInstanceConvertToPrepaidResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerAntInstanceConvertToPrepaidResponseUnmarshaller {

	public static InnerAntInstanceConvertToPrepaidResponse unmarshall(InnerAntInstanceConvertToPrepaidResponse innerAntInstanceConvertToPrepaidResponse, UnmarshallerContext context) {
		
		innerAntInstanceConvertToPrepaidResponse.setRequestId(context.stringValue("InnerAntInstanceConvertToPrepaidResponse.RequestId"));

		Data data = new Data();
		data.setOrderId(context.longValue("InnerAntInstanceConvertToPrepaidResponse.data.orderId"));
		innerAntInstanceConvertToPrepaidResponse.setData(data);
	 
	 	return innerAntInstanceConvertToPrepaidResponse;
	}
}