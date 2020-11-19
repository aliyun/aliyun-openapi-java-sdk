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

package com.aliyuncs.ipam.model.v20201023;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ipam.transform.v20201023.GetIpLocationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIpLocationResponse extends AcsResponse {

	private Integer code;

	private String message;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private Integer count;

		private List<LocationInfo> data;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<LocationInfo> getData() {
			return this.data;
		}

		public void setData(List<LocationInfo> data) {
			this.data = data;
		}

		public static class LocationInfo {

			private String prefix;

			private String country;

			private String city;

			private String resourcePoolName;

			public String getPrefix() {
				return this.prefix;
			}

			public void setPrefix(String prefix) {
				this.prefix = prefix;
			}

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getResourcePoolName() {
				return this.resourcePoolName;
			}

			public void setResourcePoolName(String resourcePoolName) {
				this.resourcePoolName = resourcePoolName;
			}
		}
	}

	@Override
	public GetIpLocationResponse getInstance(UnmarshallerContext context) {
		return	GetIpLocationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
