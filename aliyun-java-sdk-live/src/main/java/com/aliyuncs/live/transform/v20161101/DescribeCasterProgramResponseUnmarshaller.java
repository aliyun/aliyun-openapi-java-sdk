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

import com.aliyuncs.live.model.v20161101.DescribeCasterProgramResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterProgramResponse.Episode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterProgramResponseUnmarshaller {

	public static DescribeCasterProgramResponse unmarshall(DescribeCasterProgramResponse describeCasterProgramResponse, UnmarshallerContext context) {
		
		describeCasterProgramResponse.setRequestId(context.stringValue("DescribeCasterProgramResponse.RequestId"));
		describeCasterProgramResponse.setCasterId(context.stringValue("DescribeCasterProgramResponse.CasterId"));
		describeCasterProgramResponse.setProgramName(context.stringValue("DescribeCasterProgramResponse.ProgramName"));
		describeCasterProgramResponse.setProgramEffect(context.integerValue("DescribeCasterProgramResponse.ProgramEffect"));
		describeCasterProgramResponse.setTotal(context.integerValue("DescribeCasterProgramResponse.Total"));

		List<Episode> episodes = new ArrayList<Episode>();
		for (int i = 0; i < context.lengthValue("DescribeCasterProgramResponse.Episodes.Length"); i++) {
			Episode episode = new Episode();
			episode.setEpisodeId(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].EpisodeId"));
			episode.setEpisodeType(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].EpisodeType"));
			episode.setEpisodeName(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].EpisodeName"));
			episode.setResourceId(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].ResourceId"));
			episode.setStartTime(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].StartTime"));
			episode.setEndTime(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].EndTime"));
			episode.setSwitchType(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].SwitchType"));
			episode.setStatus(context.integerValue("DescribeCasterProgramResponse.Episodes["+ i +"].Status"));

			List<String> componentIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCasterProgramResponse.Episodes["+ i +"].ComponentIds.Length"); j++) {
				componentIds.add(context.stringValue("DescribeCasterProgramResponse.Episodes["+ i +"].ComponentIds["+ j +"]"));
			}
			episode.setComponentIds(componentIds);

			episodes.add(episode);
		}
		describeCasterProgramResponse.setEpisodes(episodes);
	 
	 	return describeCasterProgramResponse;
	}
}