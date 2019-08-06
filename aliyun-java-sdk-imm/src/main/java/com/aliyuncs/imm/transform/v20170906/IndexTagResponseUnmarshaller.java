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

import com.aliyuncs.imm.model.v20170906.IndexTagResponse;
import com.aliyuncs.imm.model.v20170906.IndexTagResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.IndexTagResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.IndexTagResponse.SuccessDetailsItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class IndexTagResponseUnmarshaller {

	public static IndexTagResponse unmarshall(IndexTagResponse indexTagResponse, UnmarshallerContext _ctx) {
		
		indexTagResponse.setRequestId(_ctx.stringValue("IndexTagResponse.RequestId"));
		indexTagResponse.setSetId(_ctx.stringValue("IndexTagResponse.SetId"));
		indexTagResponse.setSuccessIndexNum(_ctx.stringValue("IndexTagResponse.SuccessIndexNum"));

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("IndexTagResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(_ctx.stringValue("IndexTagResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(_ctx.stringValue("IndexTagResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		indexTagResponse.setFailDetails(failDetails);

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("IndexTagResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].SrcUri"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("IndexTagResponse.SuccessDetails["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagId(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagId"));
				tagsItem.setTagLevel(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagId(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].ParentTagId"));
				tagsItem.setParentTagName(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].ParentTagName"));
				tagsItem.setTagScore(_ctx.stringValue("IndexTagResponse.SuccessDetails["+ i +"].Tags["+ j +"].TagScore"));

				tags.add(tagsItem);
			}
			successDetailsItem.setTags(tags);

			successDetails.add(successDetailsItem);
		}
		indexTagResponse.setSuccessDetails(successDetails);
	 
	 	return indexTagResponse;
	}
}