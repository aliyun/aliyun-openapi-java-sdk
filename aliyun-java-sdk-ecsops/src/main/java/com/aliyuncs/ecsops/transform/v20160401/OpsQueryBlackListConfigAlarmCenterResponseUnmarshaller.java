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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryBlackListConfigAlarmCenterResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContent;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryBlackListConfigAlarmCenterResponse.BlacklistDimension;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryBlackListConfigAlarmCenterResponseUnmarshaller {

	public static OpsQueryBlackListConfigAlarmCenterResponse unmarshall(OpsQueryBlackListConfigAlarmCenterResponse opsQueryBlackListConfigAlarmCenterResponse, UnmarshallerContext _ctx) {
		
		opsQueryBlackListConfigAlarmCenterResponse.setBlacklistDataType(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistDataType"));

		List<BlacklistDimension> blacklistDimensions = new ArrayList<BlacklistDimension>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistDimensions.Length"); i++) {
			BlacklistDimension blacklistDimension = new BlacklistDimension();
			blacklistDimension.setBlacklistDimensionId(_ctx.integerValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistDimensions["+ i +"].BlacklistDimensionId"));
			blacklistDimension.setBlacklistDimension(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistDimensions["+ i +"].BlacklistDimension"));

			blacklistDimensions.add(blacklistDimension);
		}
		opsQueryBlackListConfigAlarmCenterResponse.setBlacklistDimensions(blacklistDimensions);

		List<BlacklistContent> blacklistContents = new ArrayList<BlacklistContent>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents.Length"); i++) {
			BlacklistContent blacklistContent = new BlacklistContent();
			blacklistContent.setBlacklistContentId(_ctx.integerValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].BlacklistContentId"));
			blacklistContent.setMetaInfoId(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].MetaInfoId"));
			blacklistContent.setStaffId(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].StaffId"));
			blacklistContent.setNickname(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].Nickname"));
			blacklistContent.setBlackContent(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].BlackContent"));
			blacklistContent.setDueTime(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].DueTime"));
			blacklistContent.setGmtCreated(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].GmtCreated"));
			blacklistContent.setGmtModified(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].GmtModified"));
			blacklistContent.setExtension(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].Extension"));
			blacklistContent.setBlacklistDimension(_ctx.stringValue("OpsQueryBlackListConfigAlarmCenterResponse.BlacklistContents["+ i +"].BlacklistDimension"));

			blacklistContents.add(blacklistContent);
		}
		opsQueryBlackListConfigAlarmCenterResponse.setBlacklistContents(blacklistContents);
	 
	 	return opsQueryBlackListConfigAlarmCenterResponse;
	}
}