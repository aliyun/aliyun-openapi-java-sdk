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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsBlackListCurdAlarmCenterResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsBlackListCurdAlarmCenterResponse.BlacklistContent;
import com.aliyuncs.ecsops.model.v20160401.OpsBlackListCurdAlarmCenterResponse.BlacklistDimension;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsBlackListCurdAlarmCenterResponseUnmarshaller {

	public static OpsBlackListCurdAlarmCenterResponse unmarshall(OpsBlackListCurdAlarmCenterResponse opsBlackListCurdAlarmCenterResponse, UnmarshallerContext _ctx) {
		
		opsBlackListCurdAlarmCenterResponse.setBpmsUrl(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BpmsUrl"));
		opsBlackListCurdAlarmCenterResponse.setUseBpms(_ctx.booleanValue("OpsBlackListCurdAlarmCenterResponse.UseBpms"));
		opsBlackListCurdAlarmCenterResponse.setBlacklistDataType(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistDataType"));
		opsBlackListCurdAlarmCenterResponse.setOperateType(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.OperateType"));

		List<BlacklistContent> blacklistContents = new ArrayList<BlacklistContent>();
		for (int i = 0; i < _ctx.lengthValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents.Length"); i++) {
			BlacklistContent blacklistContent = new BlacklistContent();
			blacklistContent.setGmtCreated(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].GmtCreated"));
			blacklistContent.setExtension(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].Extension"));
			blacklistContent.setStartDueTime(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].StartDueTime"));
			blacklistContent.setBlackContent(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].BlackContent"));
			blacklistContent.setDueTime(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].DueTime"));
			blacklistContent.setMetaInfoId(_ctx.integerValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].MetaInfoId"));
			blacklistContent.setStaffId(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].StaffId"));
			blacklistContent.setNickname(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].Nickname"));
			blacklistContent.setBlacklistContentId(_ctx.integerValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].BlacklistContentId"));
			blacklistContent.setGmtModified(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistContents["+ i +"].GmtModified"));

			blacklistContents.add(blacklistContent);
		}
		opsBlackListCurdAlarmCenterResponse.setBlacklistContents(blacklistContents);

		List<BlacklistDimension> blacklistDimensions = new ArrayList<BlacklistDimension>();
		for (int i = 0; i < _ctx.lengthValue("OpsBlackListCurdAlarmCenterResponse.BlacklistDimensions.Length"); i++) {
			BlacklistDimension blacklistDimension = new BlacklistDimension();
			blacklistDimension.setBlacklistDimension(_ctx.stringValue("OpsBlackListCurdAlarmCenterResponse.BlacklistDimensions["+ i +"].BlacklistDimension"));
			blacklistDimension.setBlacklistDimensionId(_ctx.integerValue("OpsBlackListCurdAlarmCenterResponse.BlacklistDimensions["+ i +"].BlacklistDimensionId"));

			blacklistDimensions.add(blacklistDimension);
		}
		opsBlackListCurdAlarmCenterResponse.setBlacklistDimensions(blacklistDimensions);
	 
	 	return opsBlackListCurdAlarmCenterResponse;
	}
}