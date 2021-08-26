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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeScaleStrategysResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeScaleStrategysResponse.ScaleStrategy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScaleStrategysResponseUnmarshaller {

	public static DescribeScaleStrategysResponse unmarshall(DescribeScaleStrategysResponse describeScaleStrategysResponse, UnmarshallerContext _ctx) {
		
		describeScaleStrategysResponse.setRequestId(_ctx.stringValue("DescribeScaleStrategysResponse.RequestId"));
		describeScaleStrategysResponse.setNextToken(_ctx.stringValue("DescribeScaleStrategysResponse.NextToken"));

		List<ScaleStrategy> scaleStrategys = new ArrayList<ScaleStrategy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScaleStrategysResponse.ScaleStrategys.Length"); i++) {
			ScaleStrategy scaleStrategy = new ScaleStrategy();
			scaleStrategy.setScaleStrategyId(_ctx.stringValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].ScaleStrategyId"));
			scaleStrategy.setScaleStrategyName(_ctx.stringValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].ScaleStrategyName"));
			scaleStrategy.setScaleStrategyType(_ctx.stringValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].ScaleStrategyType"));
			scaleStrategy.setMinDesktopsCount(_ctx.integerValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].MinDesktopsCount"));
			scaleStrategy.setMaxDesktopsCount(_ctx.integerValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].MaxDesktopsCount"));
			scaleStrategy.setMinAvailableDesktopsCount(_ctx.integerValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].MinAvailableDesktopsCount"));
			scaleStrategy.setMaxAvailableDesktopsCount(_ctx.integerValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].MaxAvailableDesktopsCount"));
			scaleStrategy.setScaleStep(_ctx.integerValue("DescribeScaleStrategysResponse.ScaleStrategys["+ i +"].ScaleStep"));

			scaleStrategys.add(scaleStrategy);
		}
		describeScaleStrategysResponse.setScaleStrategys(scaleStrategys);
	 
	 	return describeScaleStrategysResponse;
	}
}