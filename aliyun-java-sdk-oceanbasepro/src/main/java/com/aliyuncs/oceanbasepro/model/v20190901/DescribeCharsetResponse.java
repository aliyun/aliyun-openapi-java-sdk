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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeCharsetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCharsetResponse extends AcsResponse {

	private String requestId;

	private List<CharsetItem> charset;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CharsetItem> getCharset() {
		return this.charset;
	}

	public void setCharset(List<CharsetItem> charset) {
		this.charset = charset;
	}

	public static class CharsetItem {

		private String charset;

		private List<String> collations;

		public String getCharset() {
			return this.charset;
		}

		public void setCharset(String charset) {
			this.charset = charset;
		}

		public List<String> getCollations() {
			return this.collations;
		}

		public void setCollations(List<String> collations) {
			this.collations = collations;
		}
	}

	@Override
	public DescribeCharsetResponse getInstance(UnmarshallerContext context) {
		return	DescribeCharsetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
