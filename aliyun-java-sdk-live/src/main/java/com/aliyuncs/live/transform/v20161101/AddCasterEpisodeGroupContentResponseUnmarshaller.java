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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.AddCasterEpisodeGroupContentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCasterEpisodeGroupContentResponseUnmarshaller {

	public static AddCasterEpisodeGroupContentResponse unmarshall(AddCasterEpisodeGroupContentResponse addCasterEpisodeGroupContentResponse, UnmarshallerContext context) {
		
		addCasterEpisodeGroupContentResponse.setRequestId(context.stringValue("AddCasterEpisodeGroupContentResponse.RequestId"));
		addCasterEpisodeGroupContentResponse.setProgramId(context.stringValue("AddCasterEpisodeGroupContentResponse.ProgramId"));

		List<String> itemIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("AddCasterEpisodeGroupContentResponse.ItemIds.Length"); i++) {
			itemIds.add(context.stringValue("AddCasterEpisodeGroupContentResponse.ItemIds["+ i +"]"));
		}
		addCasterEpisodeGroupContentResponse.setItemIds(itemIds);
	 
	 	return addCasterEpisodeGroupContentResponse;
	}
}