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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListColorsResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListColorsResponse.ColorModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListColorsResponseUnmarshaller {

	public static ListColorsResponse unmarshall(ListColorsResponse listColorsResponse, UnmarshallerContext _ctx) {
		
		listColorsResponse.setRequestId(_ctx.stringValue("ListColorsResponse.RequestId"));
		listColorsResponse.setPageSize(_ctx.integerValue("ListColorsResponse.PageSize"));
		listColorsResponse.setTotalCount(_ctx.integerValue("ListColorsResponse.TotalCount"));
		listColorsResponse.setPageNumber(_ctx.integerValue("ListColorsResponse.PageNumber"));
		listColorsResponse.setSuccess(_ctx.booleanValue("ListColorsResponse.Success"));

		List<ColorModel> colors = new ArrayList<ColorModel>();
		for (int i = 0; i < _ctx.lengthValue("ListColorsResponse.Colors.Length"); i++) {
			ColorModel colorModel = new ColorModel();
			colorModel.setDescription(_ctx.stringValue("ListColorsResponse.Colors["+ i +"].Description"));
			colorModel.setName(_ctx.stringValue("ListColorsResponse.Colors["+ i +"].Name"));
			colorModel.setCreateDate(_ctx.stringValue("ListColorsResponse.Colors["+ i +"].CreateDate"));
			colorModel.setCode(_ctx.stringValue("ListColorsResponse.Colors["+ i +"].Code"));
			colorModel.setUpdateDate(_ctx.stringValue("ListColorsResponse.Colors["+ i +"].UpdateDate"));
			colorModel.setColorId(_ctx.stringValue("ListColorsResponse.Colors["+ i +"].ColorId"));
			colorModel.setDisable(_ctx.integerValue("ListColorsResponse.Colors["+ i +"].Disable"));

			colors.add(colorModel);
		}
		listColorsResponse.setColors(colors);
	 
	 	return listColorsResponse;
	}
}