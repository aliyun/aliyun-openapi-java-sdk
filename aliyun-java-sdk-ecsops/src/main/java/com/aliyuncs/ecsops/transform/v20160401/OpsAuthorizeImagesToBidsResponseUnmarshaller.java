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

import com.aliyuncs.ecsops.model.v20160401.OpsAuthorizeImagesToBidsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsAuthorizeImagesToBidsResponse.AuthorizeBid;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAuthorizeImagesToBidsResponseUnmarshaller {

	public static OpsAuthorizeImagesToBidsResponse unmarshall(OpsAuthorizeImagesToBidsResponse opsAuthorizeImagesToBidsResponse, UnmarshallerContext _ctx) {
		
		opsAuthorizeImagesToBidsResponse.setRequestId(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.RequestId"));
		opsAuthorizeImagesToBidsResponse.setTotalCount(_ctx.integerValue("OpsAuthorizeImagesToBidsResponse.TotalCount"));
		opsAuthorizeImagesToBidsResponse.setPageSize(_ctx.integerValue("OpsAuthorizeImagesToBidsResponse.PageSize"));
		opsAuthorizeImagesToBidsResponse.setPageNumber(_ctx.integerValue("OpsAuthorizeImagesToBidsResponse.PageNumber"));

		List<AuthorizeBid> authorizeBids = new ArrayList<AuthorizeBid>();
		for (int i = 0; i < _ctx.lengthValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids.Length"); i++) {
			AuthorizeBid authorizeBid = new AuthorizeBid();
			authorizeBid.setHiddenImageId(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].HiddenImageId"));
			authorizeBid.setOnlineImageId(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].OnlineImageId"));
			authorizeBid.setOsName(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].OsName"));
			authorizeBid.setOfflineImageId(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].OfflineImageId"));
			authorizeBid.setRegionId(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].RegionId"));

			List<String> bids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].Bids.Length"); j++) {
				bids.add(_ctx.stringValue("OpsAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].Bids["+ j +"]"));
			}
			authorizeBid.setBids(bids);

			authorizeBids.add(authorizeBid);
		}
		opsAuthorizeImagesToBidsResponse.setAuthorizeBids(authorizeBids);
	 
	 	return opsAuthorizeImagesToBidsResponse;
	}
}