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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeAccountAuthorityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountAuthorityResponse extends AcsResponse {

	private String requestId;

	private String accountName;

	private String dmlAuthority;

	private Boolean ddlAuthority;

	private List<String> allowDatabases;

	private List<String> totalDatabases;

	private List<String> allowDictionaries;

	private List<String> totalDictionaries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDmlAuthority() {
		return this.dmlAuthority;
	}

	public void setDmlAuthority(String dmlAuthority) {
		this.dmlAuthority = dmlAuthority;
	}

	public Boolean getDdlAuthority() {
		return this.ddlAuthority;
	}

	public void setDdlAuthority(Boolean ddlAuthority) {
		this.ddlAuthority = ddlAuthority;
	}

	public List<String> getAllowDatabases() {
		return this.allowDatabases;
	}

	public void setAllowDatabases(List<String> allowDatabases) {
		this.allowDatabases = allowDatabases;
	}

	public List<String> getTotalDatabases() {
		return this.totalDatabases;
	}

	public void setTotalDatabases(List<String> totalDatabases) {
		this.totalDatabases = totalDatabases;
	}

	public List<String> getAllowDictionaries() {
		return this.allowDictionaries;
	}

	public void setAllowDictionaries(List<String> allowDictionaries) {
		this.allowDictionaries = allowDictionaries;
	}

	public List<String> getTotalDictionaries() {
		return this.totalDictionaries;
	}

	public void setTotalDictionaries(List<String> totalDictionaries) {
		this.totalDictionaries = totalDictionaries;
	}

	@Override
	public DescribeAccountAuthorityResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountAuthorityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
