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

import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data.Component;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data.Component.Button;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatappTemplateDetailResponseUnmarshaller {

	public static GetChatappTemplateDetailResponse unmarshall(GetChatappTemplateDetailResponse getChatappTemplateDetailResponse, UnmarshallerContext _ctx) {
		
		getChatappTemplateDetailResponse.setRequestId(_ctx.stringValue("GetChatappTemplateDetailResponse.RequestId"));
		getChatappTemplateDetailResponse.setCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Code"));
		getChatappTemplateDetailResponse.setMessage(_ctx.stringValue("GetChatappTemplateDetailResponse.Message"));

		Data data = new Data();
		data.setCategory(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Category"));
		data.setTemplateCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.TemplateCode"));
		data.setName(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Name"));
		data.setLanguage(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Language"));
		data.setExample(_ctx.mapValue("GetChatappTemplateDetailResponse.Data.Example"));
		data.setAuditStatus(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.AuditStatus"));

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components.Length"); i++) {
			Component component = new Component();
			component.setType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Type"));
			component.setUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Url"));
			component.setText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Text"));

			List<Button> buttons = new ArrayList<Button>();
			for (int j = 0; j < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons.Length"); j++) {
				Button button = new Button();
				button.setType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].Type"));
				button.setText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].Text"));
				button.setPhoneNumber(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].PhoneNumber"));
				button.setUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].Url"));
				button.setUrlType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].UrlType"));

				buttons.add(button);
			}
			component.setButtons(buttons);

			components.add(component);
		}
		data.setComponents(components);
		getChatappTemplateDetailResponse.setData(data);
	 
	 	return getChatappTemplateDetailResponse;
	}
}