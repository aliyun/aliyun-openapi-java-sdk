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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerAuthorizeImagesToBidsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerAuthorizeImagesToBidsResponse.AuthorizeBid;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerAuthorizeImagesToBidsResponseUnmarshaller {

	public static InnerAuthorizeImagesToBidsResponse unmarshall(InnerAuthorizeImagesToBidsResponse innerAuthorizeImagesToBidsResponse, UnmarshallerContext context) {
		
		innerAuthorizeImagesToBidsResponse.setRequestId(context.stringValue("InnerAuthorizeImagesToBidsResponse.RequestId"));

		List<AuthorizeBid> authorizeBids = new ArrayList<AuthorizeBid>();
		for (int i = 0; i < context.lengthValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids.Length"); i++) {
			AuthorizeBid authorizeBid = new AuthorizeBid();
			authorizeBid.setOsName(context.stringValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].OsName"));
			authorizeBid.setOnlineImageId(context.stringValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].OnlineImageId"));
			authorizeBid.setHiddenImageId(context.stringValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].HiddenImageId"));
			authorizeBid.setOfflineImageId(context.stringValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].OfflineImageId"));

			List<String> bids = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].Bids.Length"); j++) {
				bids.add(context.stringValue("InnerAuthorizeImagesToBidsResponse.AuthorizeBids["+ i +"].Bids["+ j +"]"));
			}
			authorizeBid.setBids(bids);

			authorizeBids.add(authorizeBid);
		}
		innerAuthorizeImagesToBidsResponse.setAuthorizeBids(authorizeBids);
	 
	 	return innerAuthorizeImagesToBidsResponse;
	}
}