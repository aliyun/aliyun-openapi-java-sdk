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

import com.aliyuncs.live.model.v20161101.AddCasterProgramResponse;
import com.aliyuncs.live.model.v20161101.AddCasterProgramResponse.EpisodeId;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCasterProgramResponseUnmarshaller {

	public static AddCasterProgramResponse unmarshall(AddCasterProgramResponse addCasterProgramResponse, UnmarshallerContext _ctx) {
		
		addCasterProgramResponse.setRequestId(_ctx.stringValue("AddCasterProgramResponse.RequestId"));

		List<EpisodeId> episodeIds = new ArrayList<EpisodeId>();
		for (int i = 0; i < _ctx.lengthValue("AddCasterProgramResponse.EpisodeIds.Length"); i++) {
			EpisodeId episodeId = new EpisodeId();
			episodeId.setEpisodeId(_ctx.stringValue("AddCasterProgramResponse.EpisodeIds["+ i +"].EpisodeId"));

			episodeIds.add(episodeId);
		}
		addCasterProgramResponse.setEpisodeIds(episodeIds);
	 
	 	return addCasterProgramResponse;
	}
}