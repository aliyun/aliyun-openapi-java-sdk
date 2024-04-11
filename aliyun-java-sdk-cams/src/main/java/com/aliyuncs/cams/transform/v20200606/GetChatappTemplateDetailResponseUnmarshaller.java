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
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data.Component.Button.ExtendAttrs;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data.Component.轮播卡片列表;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data.Component.轮播卡片列表.卡片控件列表;
import com.aliyuncs.cams.model.v20200606.GetChatappTemplateDetailResponse.Data.Component.轮播卡片列表.卡片控件列表.卡片按钮列表;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatappTemplateDetailResponseUnmarshaller {

	public static GetChatappTemplateDetailResponse unmarshall(GetChatappTemplateDetailResponse getChatappTemplateDetailResponse, UnmarshallerContext _ctx) {
		
		getChatappTemplateDetailResponse.setRequestId(_ctx.stringValue("GetChatappTemplateDetailResponse.RequestId"));
		getChatappTemplateDetailResponse.setCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Code"));
		getChatappTemplateDetailResponse.setMessage(_ctx.stringValue("GetChatappTemplateDetailResponse.Message"));
		getChatappTemplateDetailResponse.setAccessDeniedDetail(_ctx.stringValue("GetChatappTemplateDetailResponse.AccessDeniedDetail"));

		Data data = new Data();
		data.setCategory(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Category"));
		data.setTemplateCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.TemplateCode"));
		data.setName(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Name"));
		data.setLanguage(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Language"));
		data.setExample(_ctx.mapValue("GetChatappTemplateDetailResponse.Data.Example"));
		data.setAuditStatus(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.AuditStatus"));
		data.setTemplateType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.TemplateType"));
		data.setQualityScore(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.QualityScore"));
		data.setMessageSendTtlSeconds(_ctx.integerValue("GetChatappTemplateDetailResponse.Data.MessageSendTtlSeconds"));
		data.setReason(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Reason"));

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components.Length"); i++) {
			Component component = new Component();
			component.setType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Type"));
			component.setUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Url"));
			component.setText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Text"));
			component.setCaption(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Caption"));
			component.setFileName(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].FileName"));
			component.setFormat(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Format"));
			component.setThumbUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].ThumbUrl"));
			component.setDuration(_ctx.integerValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Duration"));
			component.setFileType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].FileType"));
			component.setLatitude(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Latitude"));
			component.setLongitude(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Longitude"));
			component.setLocationName(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].LocationName"));
			component.setLocationAddress(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].LocationAddress"));
			component.setAddSecretRecommendation(_ctx.booleanValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].AddSecretRecommendation"));
			component.setCodeExpirationMinutes(_ctx.integerValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].CodeExpirationMinutes"));
			component.setHasExpiration(_ctx.booleanValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].hasExpiration"));
			component.setOfferExpirationTimeMs(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].OfferExpirationTimeMs"));

			List<Button> buttons = new ArrayList<Button>();
			for (int j = 0; j < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons.Length"); j++) {
				Button button = new Button();
				button.setType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].Type"));
				button.setText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].Text"));
				button.setPhoneNumber(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].PhoneNumber"));
				button.setUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].Url"));
				button.setUrlType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].UrlType"));
				button.setSignatureHash(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].SignatureHash"));
				button.setPackageName(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].PackageName"));
				button.setAutofillText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].AutofillText"));
				button.setIsOptOut(_ctx.booleanValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].IsOptOut"));
				button.setCouponCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].CouponCode"));
				button.setFlowId(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].FlowId"));
				button.setFlowAction(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].FlowAction"));
				button.setNavigateScreen(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].NavigateScreen"));

				ExtendAttrs extendAttrs = new ExtendAttrs();
				extendAttrs.setNextTemplateCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].ExtendAttrs.NextTemplateCode"));
				extendAttrs.setNextTemplateName(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].ExtendAttrs.NextTemplateName"));
				extendAttrs.setNextLanguageCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].ExtendAttrs.NextLanguageCode"));
				extendAttrs.setAction(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].ExtendAttrs.Action"));
				extendAttrs.setIntentCode(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Buttons["+ j +"].ExtendAttrs.IntentCode"));
				button.setExtendAttrs(extendAttrs);

				buttons.add(button);
			}
			component.setButtons(buttons);

			List<轮播卡片列表> cards = new ArrayList<轮播卡片列表>();
			for (int j = 0; j < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards.Length"); j++) {
				轮播卡片列表 轮播卡片列表 = new 轮播卡片列表();

				List<卡片控件列表> cardComponents = new ArrayList<卡片控件列表>();
				for (int k = 0; k < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents.Length"); k++) {
					卡片控件列表 卡片控件列表 = new 卡片控件列表();
					卡片控件列表.setType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Type"));
					卡片控件列表.setText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Text"));
					卡片控件列表.setUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Url"));
					卡片控件列表.setFormat(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Format"));

					List<卡片按钮列表> buttons1 = new ArrayList<卡片按钮列表>();
					for (int l = 0; l < _ctx.lengthValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Buttons.Length"); l++) {
						卡片按钮列表 卡片按钮列表 = new 卡片按钮列表();
						卡片按钮列表.setType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Buttons["+ l +"].Type"));
						卡片按钮列表.setText(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Buttons["+ l +"].Text"));
						卡片按钮列表.setUrl(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Buttons["+ l +"].Url"));
						卡片按钮列表.setUrlType(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Buttons["+ l +"].UrlType"));
						卡片按钮列表.setPhoneNumber(_ctx.stringValue("GetChatappTemplateDetailResponse.Data.Components["+ i +"].Cards["+ j +"].CardComponents["+ k +"].Buttons["+ l +"].PhoneNumber"));

						buttons1.add(卡片按钮列表);
					}
					卡片控件列表.setButtons1(buttons1);

					cardComponents.add(卡片控件列表);
				}
				轮播卡片列表.setCardComponents(cardComponents);

				cards.add(轮播卡片列表);
			}
			component.setCards(cards);

			components.add(component);
		}
		data.setComponents(components);
		getChatappTemplateDetailResponse.setData(data);
	 
	 	return getChatappTemplateDetailResponse;
	}
}