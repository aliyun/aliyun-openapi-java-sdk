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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityAlertOfAllRuleScopeByWatchIdResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertDuty;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityAlertOfAllRuleScopeByWatchIdResponseUnmarshaller {

	public static GetQualityAlertOfAllRuleScopeByWatchIdResponse unmarshall(GetQualityAlertOfAllRuleScopeByWatchIdResponse getQualityAlertOfAllRuleScopeByWatchIdResponse, UnmarshallerContext _ctx) {
		
		getQualityAlertOfAllRuleScopeByWatchIdResponse.setRequestId(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.RequestId"));
		getQualityAlertOfAllRuleScopeByWatchIdResponse.setSuccess(_ctx.booleanValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.Success"));
		getQualityAlertOfAllRuleScopeByWatchIdResponse.setHttpStatusCode(_ctx.integerValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.HttpStatusCode"));
		getQualityAlertOfAllRuleScopeByWatchIdResponse.setCode(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.Code"));
		getQualityAlertOfAllRuleScopeByWatchIdResponse.setMessage(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.Message"));

		QualityAlertInfo qualityAlertInfo = new QualityAlertInfo();
		qualityAlertInfo.setWatchId(_ctx.longValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.WatchId"));
		qualityAlertInfo.setEnableAlertQualityOwner(_ctx.booleanValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.EnableAlertQualityOwner"));

		List<String> alertUserChannelList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertUserChannelList.Length"); i++) {
			alertUserChannelList.add(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertUserChannelList["+ i +"]"));
		}
		qualityAlertInfo.setAlertUserChannelList(alertUserChannelList);

		List<String> alertDutyChannelList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertDutyChannelList.Length"); i++) {
			alertDutyChannelList.add(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertDutyChannelList["+ i +"]"));
		}
		qualityAlertInfo.setAlertDutyChannelList(alertDutyChannelList);

		List<String> alertQualityOwnerChannelList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertQualityOwnerChannelList.Length"); i++) {
			alertQualityOwnerChannelList.add(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertQualityOwnerChannelList["+ i +"]"));
		}
		qualityAlertInfo.setAlertQualityOwnerChannelList(alertQualityOwnerChannelList);

		List<AlertUser> alertUserList = new ArrayList<AlertUser>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertUserList.Length"); i++) {
			AlertUser alertUser = new AlertUser();
			alertUser.setId(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertUserList["+ i +"].Id"));
			alertUser.setName(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertUserList["+ i +"].Name"));

			alertUserList.add(alertUser);
		}
		qualityAlertInfo.setAlertUserList(alertUserList);

		List<AlertDuty> alertDutyList = new ArrayList<AlertDuty>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertDutyList.Length"); i++) {
			AlertDuty alertDuty = new AlertDuty();
			alertDuty.setId(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertDutyList["+ i +"].Id"));
			alertDuty.setName(_ctx.stringValue("GetQualityAlertOfAllRuleScopeByWatchIdResponse.QualityAlertInfo.AlertDutyList["+ i +"].Name"));

			alertDutyList.add(alertDuty);
		}
		qualityAlertInfo.setAlertDutyList(alertDutyList);
		getQualityAlertOfAllRuleScopeByWatchIdResponse.setQualityAlertInfo(qualityAlertInfo);
	 
	 	return getQualityAlertOfAllRuleScopeByWatchIdResponse;
	}
}