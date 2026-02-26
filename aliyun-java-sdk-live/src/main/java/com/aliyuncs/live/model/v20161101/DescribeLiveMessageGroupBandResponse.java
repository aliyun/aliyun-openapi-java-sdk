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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveMessageGroupBandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveMessageGroupBandResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private Boolean isbannedAll;

	private List<String> bannedUserList;

	private List<String> unbannedUserList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Boolean getIsbannedAll() {
		return this.isbannedAll;
	}

	public void setIsbannedAll(Boolean isbannedAll) {
		this.isbannedAll = isbannedAll;
	}

	public List<String> getBannedUserList() {
		return this.bannedUserList;
	}

	public void setBannedUserList(List<String> bannedUserList) {
		this.bannedUserList = bannedUserList;
	}

	public List<String> getUnbannedUserList() {
		return this.unbannedUserList;
	}

	public void setUnbannedUserList(List<String> unbannedUserList) {
		this.unbannedUserList = unbannedUserList;
	}

	@Override
	public DescribeLiveMessageGroupBandResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveMessageGroupBandResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
