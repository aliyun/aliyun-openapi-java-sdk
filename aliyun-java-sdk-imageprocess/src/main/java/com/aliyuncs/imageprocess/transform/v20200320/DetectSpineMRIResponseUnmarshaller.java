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

package com.aliyuncs.imageprocess.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageprocess.model.v20200320.DetectSpineMRIResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectSpineMRIResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectSpineMRIResponse.Data.Disc;
import com.aliyuncs.imageprocess.model.v20200320.DetectSpineMRIResponse.Data.Vertebra;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectSpineMRIResponseUnmarshaller {

	public static DetectSpineMRIResponse unmarshall(DetectSpineMRIResponse detectSpineMRIResponse, UnmarshallerContext _ctx) {
		
		detectSpineMRIResponse.setRequestId(_ctx.stringValue("DetectSpineMRIResponse.RequestId"));

		Data data = new Data();

		List<Disc> discs = new ArrayList<Disc>();
		for (int i = 0; i < _ctx.lengthValue("DetectSpineMRIResponse.Data.Discs.Length"); i++) {
			Disc disc = new Disc();
			disc.setDisease(_ctx.stringValue("DetectSpineMRIResponse.Data.Discs["+ i +"].Disease"));
			disc.setIdentification(_ctx.stringValue("DetectSpineMRIResponse.Data.Discs["+ i +"].Identification"));

			List<Float> location = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectSpineMRIResponse.Data.Discs["+ i +"].Location.Length"); j++) {
				location.add(_ctx.floatValue("DetectSpineMRIResponse.Data.Discs["+ i +"].Location["+ j +"]"));
			}
			disc.setLocation(location);

			discs.add(disc);
		}
		data.setDiscs(discs);

		List<Vertebra> vertebras = new ArrayList<Vertebra>();
		for (int i = 0; i < _ctx.lengthValue("DetectSpineMRIResponse.Data.Vertebras.Length"); i++) {
			Vertebra vertebra = new Vertebra();
			vertebra.setDisease(_ctx.stringValue("DetectSpineMRIResponse.Data.Vertebras["+ i +"].Disease"));
			vertebra.setIdentification(_ctx.stringValue("DetectSpineMRIResponse.Data.Vertebras["+ i +"].Identification"));

			List<Float> location1 = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectSpineMRIResponse.Data.Vertebras["+ i +"].Location.Length"); j++) {
				location1.add(_ctx.floatValue("DetectSpineMRIResponse.Data.Vertebras["+ i +"].Location["+ j +"]"));
			}
			vertebra.setLocation1(location1);

			vertebras.add(vertebra);
		}
		data.setVertebras(vertebras);
		detectSpineMRIResponse.setData(data);
	 
	 	return detectSpineMRIResponse;
	}
}