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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeConfigVersionDifferenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigVersionDifferenceResponse extends AcsResponse {

	private String requestId;

	private String oldConfigXML;

	private String newConfigXML;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOldConfigXML() {
		return this.oldConfigXML;
	}

	public void setOldConfigXML(String oldConfigXML) {
		this.oldConfigXML = oldConfigXML;
	}

	public String getNewConfigXML() {
		return this.newConfigXML;
	}

	public void setNewConfigXML(String newConfigXML) {
		this.newConfigXML = newConfigXML;
	}

	@Override
	public DescribeConfigVersionDifferenceResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigVersionDifferenceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
