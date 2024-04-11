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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.ListPhoneMessageQrdlResponse;
import com.aliyuncs.cams.model.v20200606.ListPhoneMessageQrdlResponse.列表;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneMessageQrdlResponseUnmarshaller {

	public static ListPhoneMessageQrdlResponse unmarshall(ListPhoneMessageQrdlResponse listPhoneMessageQrdlResponse, UnmarshallerContext _ctx) {
		
		listPhoneMessageQrdlResponse.setRequestId(_ctx.stringValue("ListPhoneMessageQrdlResponse.RequestId"));
		listPhoneMessageQrdlResponse.setCode(_ctx.stringValue("ListPhoneMessageQrdlResponse.Code"));
		listPhoneMessageQrdlResponse.setMessage(_ctx.stringValue("ListPhoneMessageQrdlResponse.Message"));

		List<列表> data = new ArrayList<列表>();
		for (int i = 0; i < _ctx.lengthValue("ListPhoneMessageQrdlResponse.Data.Length"); i++) {
			列表 列表 = new 列表();
			列表.setPhoneNumber(_ctx.stringValue("ListPhoneMessageQrdlResponse.Data["+ i +"].PhoneNumber"));
			列表.setQrdlCode(_ctx.stringValue("ListPhoneMessageQrdlResponse.Data["+ i +"].QrdlCode"));
			列表.setGenerateQrImage(_ctx.stringValue("ListPhoneMessageQrdlResponse.Data["+ i +"].GenerateQrImage"));
			列表.setPrefilledMessage(_ctx.stringValue("ListPhoneMessageQrdlResponse.Data["+ i +"].PrefilledMessage"));
			列表.setDeepLinkUrl(_ctx.stringValue("ListPhoneMessageQrdlResponse.Data["+ i +"].DeepLinkUrl"));
			列表.setQrImageUrl(_ctx.stringValue("ListPhoneMessageQrdlResponse.Data["+ i +"].QrImageUrl"));

			data.add(列表);
		}
		listPhoneMessageQrdlResponse.setData(data);
	 
	 	return listPhoneMessageQrdlResponse;
	}
}