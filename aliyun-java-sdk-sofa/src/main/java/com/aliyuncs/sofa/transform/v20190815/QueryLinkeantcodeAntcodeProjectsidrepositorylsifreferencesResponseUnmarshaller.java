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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RefListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse unmarshall(QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RequestId"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.ResultCode"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setFileCount(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.FileCount"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setRefCount(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RefCount"));
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.ResponseStatusCode"));

		List<RefListItem> refList = new ArrayList<RefListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RefList.Length"); i++) {
			RefListItem refListItem = new RefListItem();
			refListItem.setUri(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RefList["+ i +"].Uri"));

			List<String> referenceChunks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RefList["+ i +"].ReferenceChunks.Length"); j++) {
				referenceChunks.add(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.RefList["+ i +"].ReferenceChunks["+ j +"]"));
			}
			refListItem.setReferenceChunks(referenceChunks);

			refList.add(refListItem);
		}
		queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse.setRefList(refList);
	 
	 	return queryLinkeantcodeAntcodeProjectsidrepositorylsifreferencesResponse;
	}
}