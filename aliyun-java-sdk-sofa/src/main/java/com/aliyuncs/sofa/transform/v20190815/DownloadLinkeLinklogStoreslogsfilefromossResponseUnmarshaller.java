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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DownloadLinkeLinklogStoreslogsfilefromossResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadLinkeLinklogStoreslogsfilefromossResponseUnmarshaller {

	public static DownloadLinkeLinklogStoreslogsfilefromossResponse unmarshall(DownloadLinkeLinklogStoreslogsfilefromossResponse downloadLinkeLinklogStoreslogsfilefromossResponse, UnmarshallerContext _ctx) {
		
		downloadLinkeLinklogStoreslogsfilefromossResponse.setRequestId(_ctx.stringValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.RequestId"));
		downloadLinkeLinklogStoreslogsfilefromossResponse.setResultCode(_ctx.stringValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.ResultCode"));
		downloadLinkeLinklogStoreslogsfilefromossResponse.setResultMessage(_ctx.stringValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.ResultMessage"));
		downloadLinkeLinklogStoreslogsfilefromossResponse.setResponseContent(_ctx.stringValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.ResponseContent"));
		downloadLinkeLinklogStoreslogsfilefromossResponse.setResponseContentRange(_ctx.stringValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.ResponseContentRange"));
		downloadLinkeLinklogStoreslogsfilefromossResponse.setResponseContentType(_ctx.stringValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.ResponseContentType"));
		downloadLinkeLinklogStoreslogsfilefromossResponse.setResponseStatusCode(_ctx.longValue("DownloadLinkeLinklogStoreslogsfilefromossResponse.ResponseStatusCode"));
	 
	 	return downloadLinkeLinklogStoreslogsfilefromossResponse;
	}
}