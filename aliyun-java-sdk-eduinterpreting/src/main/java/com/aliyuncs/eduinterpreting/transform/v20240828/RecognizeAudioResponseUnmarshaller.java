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

package com.aliyuncs.eduinterpreting.transform.v20240828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eduinterpreting.model.v20240828.RecognizeAudioResponse;
import com.aliyuncs.eduinterpreting.model.v20240828.RecognizeAudioResponse.ItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeAudioResponseUnmarshaller {

	public static RecognizeAudioResponse unmarshall(RecognizeAudioResponse recognizeAudioResponse, UnmarshallerContext _ctx) {
		
		recognizeAudioResponse.setRequestId(_ctx.stringValue("RecognizeAudioResponse.RequestId"));
		recognizeAudioResponse.setTaskId(_ctx.stringValue("RecognizeAudioResponse.TaskId"));

		List<ItemListItem> itemList = new ArrayList<ItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeAudioResponse.ItemList.Length"); i++) {
			ItemListItem itemListItem = new ItemListItem();
			itemListItem.setBeginTime(_ctx.stringValue("RecognizeAudioResponse.ItemList["+ i +"].BeginTime"));
			itemListItem.setEndTime(_ctx.stringValue("RecognizeAudioResponse.ItemList["+ i +"].EndTime"));
			itemListItem.setText(_ctx.stringValue("RecognizeAudioResponse.ItemList["+ i +"].Text"));

			itemList.add(itemListItem);
		}
		recognizeAudioResponse.setItemList(itemList);
	 
	 	return recognizeAudioResponse;
	}
}