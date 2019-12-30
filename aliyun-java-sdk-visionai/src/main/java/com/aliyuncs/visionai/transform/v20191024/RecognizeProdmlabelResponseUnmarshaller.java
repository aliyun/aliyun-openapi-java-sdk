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

package com.aliyuncs.visionai.transform.v20191024;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.visionai.model.v20191024.RecognizeProdmlabelResponse;
import com.aliyuncs.visionai.model.v20191024.RecognizeProdmlabelResponse.CommodityAttributeLabel;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeProdmlabelResponseUnmarshaller {

	public static RecognizeProdmlabelResponse unmarshall(RecognizeProdmlabelResponse recognizeProdmlabelResponse, UnmarshallerContext _ctx) {
		
		recognizeProdmlabelResponse.setRequestId(_ctx.stringValue("RecognizeProdmlabelResponse.RequestId"));

		List<CommodityAttributeLabel> data = new ArrayList<CommodityAttributeLabel>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeProdmlabelResponse.Data.Length"); i++) {
			CommodityAttributeLabel commodityAttributeLabel = new CommodityAttributeLabel();
			commodityAttributeLabel.setScore(_ctx.floatValue("RecognizeProdmlabelResponse.Data["+ i +"].Score"));
			commodityAttributeLabel.setPropertyId(_ctx.longValue("RecognizeProdmlabelResponse.Data["+ i +"].PropertyId"));
			commodityAttributeLabel.setPropertyName(_ctx.stringValue("RecognizeProdmlabelResponse.Data["+ i +"].PropertyName"));
			commodityAttributeLabel.setSubId(_ctx.longValue("RecognizeProdmlabelResponse.Data["+ i +"].SubId"));
			commodityAttributeLabel.setPropertyValue(_ctx.stringValue("RecognizeProdmlabelResponse.Data["+ i +"].PropertyValue"));

			data.add(commodityAttributeLabel);
		}
		recognizeProdmlabelResponse.setData(data);
	 
	 	return recognizeProdmlabelResponse;
	}
}