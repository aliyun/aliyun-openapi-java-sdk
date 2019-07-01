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

	@Override
	public DescribeBizTypeSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeBizTypeSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
