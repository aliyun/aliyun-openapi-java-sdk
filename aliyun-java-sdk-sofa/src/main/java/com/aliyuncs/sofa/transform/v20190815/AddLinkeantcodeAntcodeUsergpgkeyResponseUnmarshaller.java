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

import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeUsergpgkeyResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeUsergpgkeyResponse.SubkeysItem;
import com.aliyuncs.sofa.model.v20190815.AddLinkeantcodeAntcodeUsergpgkeyResponse.UserId;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeantcodeAntcodeUsergpgkeyResponseUnmarshaller {

	public static AddLinkeantcodeAntcodeUsergpgkeyResponse unmarshall(AddLinkeantcodeAntcodeUsergpgkeyResponse addLinkeantcodeAntcodeUsergpgkeyResponse, UnmarshallerContext _ctx) {
		
		addLinkeantcodeAntcodeUsergpgkeyResponse.setRequestId(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.RequestId"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setResultCode(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.ResultCode"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setResultMessage(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.ResultMessage"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setCreatedAt(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.CreatedAt"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setFingerprint(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.Fingerprint"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setId(_ctx.longValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.Id"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setResponseStatusCode(_ctx.longValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.ResponseStatusCode"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setVerified(_ctx.booleanValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.Verified"));

		UserId userId = new UserId();
		userId.setEmail(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.UserId.Email"));
		userId.setName(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.UserId.Name"));
		addLinkeantcodeAntcodeUsergpgkeyResponse.setUserId(userId);

		List<SubkeysItem> subkeys = new ArrayList<SubkeysItem>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.Subkeys.Length"); i++) {
			SubkeysItem subkeysItem = new SubkeysItem();
			subkeysItem.setFingerprint(_ctx.stringValue("AddLinkeantcodeAntcodeUsergpgkeyResponse.Subkeys["+ i +"].Fingerprint"));

			subkeys.add(subkeysItem);
		}
		addLinkeantcodeAntcodeUsergpgkeyResponse.setSubkeys(subkeys);
	 
	 	return addLinkeantcodeAntcodeUsergpgkeyResponse;
	}
}