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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeEcsScenarioFacadeResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeEcsScenarioFacadeResponse.Scenario;
import com.aliyuncs.ecs.model.v20160314.DescribeEcsScenarioFacadeResponse.Scenario.Content;
import com.aliyuncs.ecs.model.v20160314.DescribeEcsScenarioFacadeResponse.Scenario.Content.EcsScenarioContent;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcsScenarioFacadeResponseUnmarshaller {

	public static DescribeEcsScenarioFacadeResponse unmarshall(DescribeEcsScenarioFacadeResponse describeEcsScenarioFacadeResponse, UnmarshallerContext _ctx) {
		
		describeEcsScenarioFacadeResponse.setRequestId(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.RequestId"));

		List<Scenario> scenarios = new ArrayList<Scenario>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEcsScenarioFacadeResponse.Scenarios.Length"); i++) {
			Scenario scenario = new Scenario();
			scenario.setScenario(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Scenario"));

			List<Content> contents = new ArrayList<Content>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents.Length"); j++) {
				Content content = new Content();
				content.setAction(_ctx.mapValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Action"));
				content.setTrack(_ctx.mapValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Track"));
				content.setAttributes(_ctx.mapValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Attributes"));
				content.setTitle(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Title"));
				content.setDescription(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Description"));
				content.setIcon(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Icon"));
				content.setTips(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].Tips"));
				content.setColorLevel(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].ColorLevel"));
				content.setSupportCancel(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].SupportCancel"));

				List<EcsScenarioContent> ecsScenarioContentData = new ArrayList<EcsScenarioContent>();
				for (int k = 0; k < _ctx.lengthValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].EcsScenarioContentData.Length"); k++) {
					EcsScenarioContent ecsScenarioContent = new EcsScenarioContent();
					ecsScenarioContent.setType(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].EcsScenarioContentData["+ k +"].Type"));

					List<String> values = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].EcsScenarioContentData["+ k +"].Values.Length"); l++) {
						values.add(_ctx.stringValue("DescribeEcsScenarioFacadeResponse.Scenarios["+ i +"].Contents["+ j +"].EcsScenarioContentData["+ k +"].Values["+ l +"]"));
					}
					ecsScenarioContent.setValues(values);

					ecsScenarioContentData.add(ecsScenarioContent);
				}
				content.setEcsScenarioContentData(ecsScenarioContentData);

				contents.add(content);
			}
			scenario.setContents(contents);

			scenarios.add(scenario);
		}
		describeEcsScenarioFacadeResponse.setScenarios(scenarios);
	 
	 	return describeEcsScenarioFacadeResponse;
	}
}