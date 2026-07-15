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

package com.aliyuncs.schedulerx2.transform.v20190430;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxNotificationPolicyResponse;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxNotificationPolicyResponse.Data;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxNotificationPolicyResponse.Data.Record;
import com.aliyuncs.schedulerx2.model.v20190430.ReadSchedulerxNotificationPolicyResponse.Data.Record.ReferencedApp;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReadSchedulerxNotificationPolicyResponseUnmarshaller {

	public static ReadSchedulerxNotificationPolicyResponse unmarshall(ReadSchedulerxNotificationPolicyResponse readSchedulerxNotificationPolicyResponse, UnmarshallerContext _ctx) {
		
		readSchedulerxNotificationPolicyResponse.setRequestId(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.RequestId"));
		readSchedulerxNotificationPolicyResponse.setMessage(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Message"));
		readSchedulerxNotificationPolicyResponse.setCode(_ctx.integerValue("ReadSchedulerxNotificationPolicyResponse.Code"));
		readSchedulerxNotificationPolicyResponse.setSuccess(_ctx.booleanValue("ReadSchedulerxNotificationPolicyResponse.Success"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setPolicyType(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.PolicyType"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setAuthAction(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.AccessDeniedDetail.AuthAction"));
		readSchedulerxNotificationPolicyResponse.setAccessDeniedDetail(accessDeniedDetail);

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.NextToken"));
		data.setTotal(_ctx.longValue("ReadSchedulerxNotificationPolicyResponse.Data.Total"));
		data.setMaxResults(_ctx.integerValue("ReadSchedulerxNotificationPolicyResponse.Data.MaxResults"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ReadSchedulerxNotificationPolicyResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setDescription(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].Description"));
			record.setUpdater(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].Updater"));
			record.setPolicyName(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].PolicyName"));
			record.setCreateTime(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].CreateTime"));
			record.setUpdateTime(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].UpdateTime"));
			record.setCreator(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].Creator"));
			record.setChannelTimeRange(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].ChannelTimeRange"));

			List<ReferencedApp> referenceApps = new ArrayList<ReferencedApp>();
			for (int j = 0; j < _ctx.lengthValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].ReferenceApps.Length"); j++) {
				ReferencedApp referencedApp = new ReferencedApp();
				referencedApp.setNamespaceName(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].ReferenceApps["+ j +"].NamespaceName"));
				referencedApp.setNamespaceUid(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].ReferenceApps["+ j +"].NamespaceUid"));
				referencedApp.setAppGroupId(_ctx.longValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].ReferenceApps["+ j +"].AppGroupId"));
				referencedApp.setGroupId(_ctx.stringValue("ReadSchedulerxNotificationPolicyResponse.Data.Records["+ i +"].ReferenceApps["+ j +"].GroupId"));

				referenceApps.add(referencedApp);
			}
			record.setReferenceApps(referenceApps);

			records.add(record);
		}
		data.setRecords(records);
		readSchedulerxNotificationPolicyResponse.setData(data);
	 
	 	return readSchedulerxNotificationPolicyResponse;
	}
}