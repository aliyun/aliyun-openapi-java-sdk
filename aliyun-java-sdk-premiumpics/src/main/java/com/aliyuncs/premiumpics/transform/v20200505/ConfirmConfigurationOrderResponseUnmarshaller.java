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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.ConfirmConfigurationOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmConfigurationOrderResponseUnmarshaller {

	public static ConfirmConfigurationOrderResponse unmarshall(ConfirmConfigurationOrderResponse confirmConfigurationOrderResponse, UnmarshallerContext _ctx) {
		
		confirmConfigurationOrderResponse.setRequestId(_ctx.stringValue("ConfirmConfigurationOrderResponse.RequestId"));
		confirmConfigurationOrderResponse.setErrorMsg(_ctx.stringValue("ConfirmConfigurationOrderResponse.ErrorMsg"));
		confirmConfigurationOrderResponse.setErrorCode(_ctx.stringValue("ConfirmConfigurationOrderResponse.ErrorCode"));
		confirmConfigurationOrderResponse.setSuccess(_ctx.booleanValue("ConfirmConfigurationOrderResponse.Success"));

		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("ConfirmConfigurationOrderResponse.Data.Length"); i++) {
			data.add(_ctx.longValue("ConfirmConfigurationOrderResponse.Data["+ i +"]"));
		}
		confirmConfigurationOrderResponse.setData(data);
	 
	 	return confirmConfigurationOrderResponse;
	}
}