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

import com.aliyuncs.ecsops.model.v20160401.OpsAuthorizeImagesToAliUidsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUid;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAuthorizeImagesToAliUidsResponseUnmarshaller {

	public static OpsAuthorizeImagesToAliUidsResponse unmarshall(OpsAuthorizeImagesToAliUidsResponse opsAuthorizeImagesToAliUidsResponse, UnmarshallerContext _ctx) {
		
		opsAuthorizeImagesToAliUidsResponse.setRequestId(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.RequestId"));

		List<AuthorizeAliUid> authorizeAliUids = new ArrayList<AuthorizeAliUid>();
		for (int i = 0; i < _ctx.lengthValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids.Length"); i++) {
			AuthorizeAliUid authorizeAliUid = new AuthorizeAliUid();
			authorizeAliUid.setHiddenImageId(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].HiddenImageId"));
			authorizeAliUid.setOnlineImageId(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].OnlineImageId"));
			authorizeAliUid.setOsName(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].OsName"));
			authorizeAliUid.setOfflineImageId(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].OfflineImageId"));
			authorizeAliUid.setDeprecatedImageId(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].DeprecatedImageId"));

			List<String> aliUids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].AliUids.Length"); j++) {
				aliUids.add(_ctx.stringValue("OpsAuthorizeImagesToAliUidsResponse.AuthorizeAliUids["+ i +"].AliUids["+ j +"]"));
			}
			authorizeAliUid.setAliUids(aliUids);

			authorizeAliUids.add(authorizeAliUid);
		}
		opsAuthorizeImagesToAliUidsResponse.setAuthorizeAliUids(authorizeAliUids);
	 
	 	return opsAuthorizeImagesToAliUidsResponse;
	}
}