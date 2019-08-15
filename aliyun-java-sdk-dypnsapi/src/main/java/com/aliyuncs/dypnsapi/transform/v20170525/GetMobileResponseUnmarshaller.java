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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.GetMobileResponse;
import com.aliyuncs.dypnsapi.model.v20170525.GetMobileResponse.GetMobileResultDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMobileResponseUnmarshaller {

	public static GetMobileResponse unmarshall(GetMobileResponse getMobileResponse, UnmarshallerContext _ctx) {
		
		getMobileResponse.setRequestId(_ctx.stringValue("GetMobileResponse.RequestId"));
		getMobileResponse.setCode(_ctx.stringValue("GetMobileResponse.Code"));
		getMobileResponse.setMessage(_ctx.stringValue("GetMobileResponse.Message"));

		GetMobileResultDTO getMobileResultDTO = new GetMobileResultDTO();
		getMobileResultDTO.setMobile(_ctx.stringValue("GetMobileResponse.GetMobileResultDTO.Mobile"));
		getMobileResponse.setGetMobileResultDTO(getMobileResultDTO);
	 
	 	return getMobileResponse;
	}
}