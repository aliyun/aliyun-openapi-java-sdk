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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateChatappTemplateRequest extends RpcAcsRequest<CreateChatappTemplateResponse> {
	   

	@SerializedName("components")
	private List<Components> components;

	private String language;

	@SerializedName("example")
	private Map<String,String> example;

	private String templateType;

	private String name;

	private String category;
	public CreateChatappTemplateRequest() {
		super("cams", "2020-06-06", "CreateChatappTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Components> getComponents() {
		return this.components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;	
		if (components != null) {
			putBodyParameter("Components" , new Gson().toJson(components));
		}	
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putBodyParameter("Language", language);
		}
	}

	public Map<String,String> getExample() {
		return this.example;
	}

	public void setExample(Map<String,String> example) {
		this.example = example;	
		if (example != null) {
			putBodyParameter("Example" , new Gson().toJson(example));
		}	
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putBodyParameter("TemplateType", templateType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	public static class Components {

		@SerializedName("Type")
		private String type;

		@SerializedName("Text")
		private String text;

		@SerializedName("Format")
		private String format;

		@SerializedName("Url")
		private String url;

		@SerializedName("Buttons")
		private List<ButtonsItem> buttons;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<ButtonsItem> getButtons() {
			return this.buttons;
		}

		public void setButtons(List<ButtonsItem> buttons) {
			this.buttons = buttons;
		}

		public static class ButtonsItem {

			@SerializedName("Type")
			private String type;

			@SerializedName("Text")
			private String text;

			@SerializedName("PhoneNumber")
			private String phoneNumber;

			@SerializedName("Url")
			private String url;

			@SerializedName("UrlType")
			private String urlType;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getUrlType() {
				return this.urlType;
			}

			public void setUrlType(String urlType) {
				this.urlType = urlType;
			}
		}
	}

	@Override
	public Class<CreateChatappTemplateResponse> getResponseClass() {
		return CreateChatappTemplateResponse.class;
	}

}
