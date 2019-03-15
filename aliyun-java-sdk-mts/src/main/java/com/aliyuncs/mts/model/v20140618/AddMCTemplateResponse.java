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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.AddMCTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMCTemplateResponse extends AcsResponse {

	private String requestId;

	private Template template;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Template getTemplate() {
		return this.template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public static class Template {

		private String templateId;

		private String name;

		private String porn;

		private String terrorism;

		private String politics;

		private String ad;

		private String qrcode;

		private String live;

		private String logo;

		private String abuse;

		private String contraband;

		private String spam;

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPorn() {
			return this.porn;
		}

		public void setPorn(String porn) {
			this.porn = porn;
		}

		public String getTerrorism() {
			return this.terrorism;
		}

		public void setTerrorism(String terrorism) {
			this.terrorism = terrorism;
		}

		public String getPolitics() {
			return this.politics;
		}

		public void setPolitics(String politics) {
			this.politics = politics;
		}

		public String getAd() {
			return this.ad;
		}

		public void setAd(String ad) {
			this.ad = ad;
		}

		public String getQrcode() {
			return this.qrcode;
		}

		public void setQrcode(String qrcode) {
			this.qrcode = qrcode;
		}

		public String getLive() {
			return this.live;
		}

		public void setLive(String live) {
			this.live = live;
		}

		public String getLogo() {
			return this.logo;
		}

		public void setLogo(String logo) {
			this.logo = logo;
		}

		public String getAbuse() {
			return this.abuse;
		}

		public void setAbuse(String abuse) {
			this.abuse = abuse;
		}

		public String getContraband() {
			return this.contraband;
		}

		public void setContraband(String contraband) {
			this.contraband = contraband;
		}

		public String getSpam() {
			return this.spam;
		}

		public void setSpam(String spam) {
			this.spam = spam;
		}
	}

	@Override
	public AddMCTemplateResponse getInstance(UnmarshallerContext context) {
		return	AddMCTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
