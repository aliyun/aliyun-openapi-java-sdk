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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.DetectTagResponse;
import com.aliyuncs.imm.model.v20170906.DetectTagResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectTagResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectTagResponse.SuccessDetailsItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectTagResponseUnmarshaller {

	public static DetectTagResponse unmarshall(DetectTagResponse detectTagResponse, UnmarshallerContext _ctx) {
		
		detectTagResponse.setRequestId(_ctx.stringValue("DetectTagResponse.RequestId"));
		detectTagResponse.setSuccessNum(_ctx.stringValue("DetectTagResponse.SuccessNum"));

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectTagResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].SrcUri"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectTagResponse.SuccessDetails["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagId(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagId"));
				tagsItem.setTagLevel(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagId(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].ParentTagId"));
				tagsItem.setParentTagName(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].ParentTagName"));
				tagsItem.setTagScore(_ctx.stringValue("DetectTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagScore"));

				tags.add(tagsItem);
			}
			successDetailsItem.setTags(tags);

			successDetails.add(successDetailsItem);
		}
		detectTagResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectTagResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(_ctx.stringValue("DetectTagResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(_ctx.stringValue("DetectTagResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		detectTagResponse.setFailDetails(failDetails);
	 
	 	return detectTagResponse;
	}
}