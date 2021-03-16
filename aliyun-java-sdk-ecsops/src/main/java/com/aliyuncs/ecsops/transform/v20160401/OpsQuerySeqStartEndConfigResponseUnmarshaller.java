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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQuerySeqStartEndConfigResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQuerySeqStartEndConfigResponse.SeqStartEndConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQuerySeqStartEndConfigResponseUnmarshaller {

	public static OpsQuerySeqStartEndConfigResponse unmarshall(OpsQuerySeqStartEndConfigResponse opsQuerySeqStartEndConfigResponse, UnmarshallerContext _ctx) {
		
		opsQuerySeqStartEndConfigResponse.setRequestId(_ctx.stringValue("OpsQuerySeqStartEndConfigResponse.RequestId"));

		List<SeqStartEndConfig> seqStartEndConfigs = new ArrayList<SeqStartEndConfig>();
		for (int i = 0; i < _ctx.lengthValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs.Length"); i++) {
			SeqStartEndConfig seqStartEndConfig = new SeqStartEndConfig();
			seqStartEndConfig.setName(_ctx.stringValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].Name"));
			seqStartEndConfig.setDescription(_ctx.stringValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].Description"));

			List<String> startEvents = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].StartEvents.Length"); j++) {
				startEvents.add(_ctx.stringValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].StartEvents["+ j +"]"));
			}
			seqStartEndConfig.setStartEvents(startEvents);

			List<String> endEvents = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].EndEvents.Length"); j++) {
				endEvents.add(_ctx.stringValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].EndEvents["+ j +"]"));
			}
			seqStartEndConfig.setEndEvents(endEvents);

			List<String> relatedAlarms = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].RelatedAlarms.Length"); j++) {
				relatedAlarms.add(_ctx.stringValue("OpsQuerySeqStartEndConfigResponse.SeqStartEndConfigs["+ i +"].RelatedAlarms["+ j +"]"));
			}
			seqStartEndConfig.setRelatedAlarms(relatedAlarms);

			seqStartEndConfigs.add(seqStartEndConfig);
		}
		opsQuerySeqStartEndConfigResponse.setSeqStartEndConfigs(seqStartEndConfigs);
	 
	 	return opsQuerySeqStartEndConfigResponse;
	}
}