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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeLsifreferencesResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeLsifreferencesResponse.RefListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeLsifreferencesResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeLsifreferencesResponse unmarshall(CreateLinkeantcodeAntcodeLsifreferencesResponse createLinkeantcodeAntcodeLsifreferencesResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeLsifreferencesResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.RequestId"));
		createLinkeantcodeAntcodeLsifreferencesResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.ResultCode"));
		createLinkeantcodeAntcodeLsifreferencesResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.ResultMessage"));
		createLinkeantcodeAntcodeLsifreferencesResponse.setFileCount(_ctx.longValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.FileCount"));
		createLinkeantcodeAntcodeLsifreferencesResponse.setRefCount(_ctx.longValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.RefCount"));
		createLinkeantcodeAntcodeLsifreferencesResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.ResponseStatusCode"));

		List<RefListItem> refList = new ArrayList<RefListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.RefList.Length"); i++) {
			RefListItem refListItem = new RefListItem();
			refListItem.setUri(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.RefList["+ i +"].Uri"));

			List<String> referenceChunks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.RefList["+ i +"].ReferenceChunks.Length"); j++) {
				referenceChunks.add(_ctx.stringValue("CreateLinkeantcodeAntcodeLsifreferencesResponse.RefList["+ i +"].ReferenceChunks["+ j +"]"));
			}
			refListItem.setReferenceChunks(referenceChunks);

			refList.add(refListItem);
		}
		createLinkeantcodeAntcodeLsifreferencesResponse.setRefList(refList);
	 
	 	return createLinkeantcodeAntcodeLsifreferencesResponse;
	}
}