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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeBizTypeSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBizTypeSettingResponse extends AcsResponse {

	private String requestId;

	private Terrorism terrorism;

	private Porn porn;

	private Antispam antispam;

	private Ad ad;

	private Live live;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Terrorism getTerrorism() {
		return this.terrorism;
	}

	public void setTerrorism(Terrorism terrorism) {
		this.terrorism = terrorism;
	}

	public Porn getPorn() {
		return this.porn;
	}

	public void setPorn(Porn porn) {
		this.porn = porn;
	}

	public Antispam getAntispam() {
		return this.antispam;
	}

	public void setAntispam(Antispam antispam) {
		this.antispam = antispam;
	}

	public Ad getAd() {
		return this.ad;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
	}

	public Live getLive() {
		return this.live;
	}

	public void setLive(Live live) {
		this.live = live;
	}

	public static class Terrorism {

		private List<String> categories;

		public List<String> getCategories() {
			return this.categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}
	}

	public static class Porn {

		private List<String> categories1;

		public List<String> getCategories1() {
			return this.categories1;
		}

		public void setCategories1(List<String> categories1) {
			this.categories1 = categories1;
		}
	}

	public static class Antispam {

		private List<String> categories2;

		public List<String> getCategories2() {
			return this.categories2;
		}

		public void setCategories2(List<String> categories2) {
			this.categories2 = categories2;
		}
	}

	public static class Ad {

		private List<String> categories3;

		public List<String> getCategories3() {
			return this.categories3;
		}

		public void setCategories3(List<String> categories3) {
			this.categories3 = categories3;
		}
	}

	public static class Live {

		private List<String> categories4;

		public List<String> getCategories4() {
			return this.categories4;
		}

		public void setCategories4(List<String> categories4) {
			this.categories4 = categories4;
		}
	}

	@Override
	public DescribeBizTypeSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeBizTypeSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
