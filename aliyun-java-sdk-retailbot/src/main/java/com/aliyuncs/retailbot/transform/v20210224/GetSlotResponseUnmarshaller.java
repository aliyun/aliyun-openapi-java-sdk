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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.GetSlotResponse;
import com.aliyuncs.retailbot.model.v20210224.GetSlotResponse.Data;
import com.aliyuncs.retailbot.model.v20210224.GetSlotResponse.Data.BlackEntryListItem;
import com.aliyuncs.retailbot.model.v20210224.GetSlotResponse.Data.SimilarEntryListItem;
import com.aliyuncs.retailbot.model.v20210224.GetSlotResponse.Data.SimilarEntryListItem.CoreEntry;
import com.aliyuncs.retailbot.model.v20210224.GetSlotResponse.Data.SimilarEntryListItem.SimilarEntrie;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSlotResponseUnmarshaller {

	public static GetSlotResponse unmarshall(GetSlotResponse getSlotResponse, UnmarshallerContext _ctx) {
		
		getSlotResponse.setRequestId(_ctx.stringValue("GetSlotResponse.RequestId"));
		getSlotResponse.setSuccess(_ctx.booleanValue("GetSlotResponse.Success"));
		getSlotResponse.setCode(_ctx.stringValue("GetSlotResponse.Code"));
		getSlotResponse.setMessage(_ctx.stringValue("GetSlotResponse.Message"));
		getSlotResponse.setHttpStatusCode(_ctx.integerValue("GetSlotResponse.HttpStatusCode"));

		Data data = new Data();
		data.setId(_ctx.integerValue("GetSlotResponse.Data.Id"));
		data.setAlias(_ctx.stringValue("GetSlotResponse.Data.Alias"));
		data.setCategoryId(_ctx.integerValue("GetSlotResponse.Data.CategoryId"));
		data.setCategoryName(_ctx.stringValue("GetSlotResponse.Data.CategoryName"));
		data.setSource(_ctx.integerValue("GetSlotResponse.Data.Source"));
		data.setSourceName(_ctx.stringValue("GetSlotResponse.Data.SourceName"));
		data.setType(_ctx.integerValue("GetSlotResponse.Data.Type"));
		data.setTypeName(_ctx.stringValue("GetSlotResponse.Data.TypeName"));
		data.setDescription(_ctx.stringValue("GetSlotResponse.Data.Description"));
		data.setOwnStatus(_ctx.integerValue("GetSlotResponse.Data.OwnStatus"));

		List<SimilarEntryListItem> similarEntryList = new ArrayList<SimilarEntryListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSlotResponse.Data.SimilarEntryList.Length"); i++) {
			SimilarEntryListItem similarEntryListItem = new SimilarEntryListItem();

			CoreEntry coreEntry = new CoreEntry();
			coreEntry.setId(_ctx.integerValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].CoreEntry.Id"));
			coreEntry.setSlotId(_ctx.integerValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].CoreEntry.SlotId"));
			coreEntry.setValue(_ctx.stringValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].CoreEntry.Value"));
			similarEntryListItem.setCoreEntry(coreEntry);

			List<SimilarEntrie> similarEntries = new ArrayList<SimilarEntrie>();
			for (int j = 0; j < _ctx.lengthValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].SimilarEntries.Length"); j++) {
				SimilarEntrie similarEntrie = new SimilarEntrie();
				similarEntrie.setId(_ctx.integerValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].SimilarEntries["+ j +"].Id"));
				similarEntrie.setSlotId(_ctx.integerValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].SimilarEntries["+ j +"].SlotId"));
				similarEntrie.setValue(_ctx.stringValue("GetSlotResponse.Data.SimilarEntryList["+ i +"].SimilarEntries["+ j +"].Value"));

				similarEntries.add(similarEntrie);
			}
			similarEntryListItem.setSimilarEntries(similarEntries);

			similarEntryList.add(similarEntryListItem);
		}
		data.setSimilarEntryList(similarEntryList);

		List<BlackEntryListItem> blackEntryList = new ArrayList<BlackEntryListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSlotResponse.Data.BlackEntryList.Length"); i++) {
			BlackEntryListItem blackEntryListItem = new BlackEntryListItem();
			blackEntryListItem.setId(_ctx.integerValue("GetSlotResponse.Data.BlackEntryList["+ i +"].Id"));
			blackEntryListItem.setSlotId(_ctx.integerValue("GetSlotResponse.Data.BlackEntryList["+ i +"].SlotId"));
			blackEntryListItem.setValue(_ctx.stringValue("GetSlotResponse.Data.BlackEntryList["+ i +"].Value"));

			blackEntryList.add(blackEntryListItem);
		}
		data.setBlackEntryList(blackEntryList);
		getSlotResponse.setData(data);
	 
	 	return getSlotResponse;
	}
}