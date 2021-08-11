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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribePrefixListAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePrefixListAttributesResponse extends AcsResponse {

	private String requestId;

	private String prefixListId;

	private String prefixListName;

	private String addressFamily;

	private Integer maxEntries;

	private String description;

	private String creationTime;

	private List<Entry> entries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPrefixListId() {
		return this.prefixListId;
	}

	public void setPrefixListId(String prefixListId) {
		this.prefixListId = prefixListId;
	}

	public String getPrefixListName() {
		return this.prefixListName;
	}

	public void setPrefixListName(String prefixListName) {
		this.prefixListName = prefixListName;
	}

	public String getAddressFamily() {
		return this.addressFamily;
	}

	public void setAddressFamily(String addressFamily) {
		this.addressFamily = addressFamily;
	}

	public Integer getMaxEntries() {
		return this.maxEntries;
	}

	public void setMaxEntries(Integer maxEntries) {
		this.maxEntries = maxEntries;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public List<Entry> getEntries() {
		return this.entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public static class Entry {

		private String cidr;

		private String description;

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribePrefixListAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribePrefixListAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
