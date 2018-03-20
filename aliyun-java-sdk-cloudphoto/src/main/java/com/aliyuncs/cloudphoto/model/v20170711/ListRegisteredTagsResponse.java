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

package com.aliyuncs.cloudphoto.model.v20170711;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.ListRegisteredTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRegisteredTagsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private List<RegisteredTag> registeredTags;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<RegisteredTag> getRegisteredTags() {
		return this.registeredTags;
	}

	public void setRegisteredTags(List<RegisteredTag> registeredTags) {
		this.registeredTags = registeredTags;
	}

	public static class RegisteredTag {

		private String tagKey;

		private List<TagValue> tagValues;

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public List<TagValue> getTagValues() {
			return this.tagValues;
		}

		public void setTagValues(List<TagValue> tagValues) {
			this.tagValues = tagValues;
		}

		public static class TagValue {

			private String lang;

			private String text;

			public String getLang() {
				return this.lang;
			}

			public void setLang(String lang) {
				this.lang = lang;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}
		}
	}

	@Override
	public ListRegisteredTagsResponse getInstance(UnmarshallerContext context) {
		return	ListRegisteredTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
