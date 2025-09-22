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

package com.aliyuncs.anytrans.transform.v20250707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.BoundingBoxesItem;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.BoundingBoxesItem.DownLeft;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.BoundingBoxesItem.DownRight;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.BoundingBoxesItem.UpLeft;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.BoundingBoxesItem.UpRight;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.TableInfosItem;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.TableInfosItem.CellInfosItem;
import com.aliyuncs.anytrans.model.v20250707.GetImageTranslateTaskResponse.Data.Translation.TableInfosItem.CellInfosItem.PosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageTranslateTaskResponseUnmarshaller {

	public static GetImageTranslateTaskResponse unmarshall(GetImageTranslateTaskResponse getImageTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		getImageTranslateTaskResponse.setCode(_ctx.stringValue("GetImageTranslateTaskResponse.code"));
		getImageTranslateTaskResponse.setMessage(_ctx.stringValue("GetImageTranslateTaskResponse.message"));
		getImageTranslateTaskResponse.setRequestId(_ctx.stringValue("GetImageTranslateTaskResponse.requestId"));
		getImageTranslateTaskResponse.setSuccess(_ctx.booleanValue("GetImageTranslateTaskResponse.success"));
		getImageTranslateTaskResponse.setHttpStatusCode(_ctx.stringValue("GetImageTranslateTaskResponse.httpStatusCode"));
		getImageTranslateTaskResponse.setSynchro(_ctx.booleanValue("GetImageTranslateTaskResponse.synchro"));

		Data data = new Data();
		data.setTraceId(_ctx.stringValue("GetImageTranslateTaskResponse.data.traceId"));

		Translation translation = new Translation();
		translation.setAngle(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.angle"));
		translation.setWidth(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.width"));
		translation.setHeight(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.height"));
		translation.setOrgWidth(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.orgWidth"));
		translation.setOrgHeight(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.orgHeight"));
		translation.setBoxesCount(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boxesCount"));

		List<BoundingBoxesItem> boundingBoxes = new ArrayList<BoundingBoxesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes.Length"); i++) {
			BoundingBoxesItem boundingBoxesItem = new BoundingBoxesItem();
			boundingBoxesItem.setConfidence(_ctx.floatValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].confidence"));
			boundingBoxesItem.setText(_ctx.stringValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].text"));
			boundingBoxesItem.setDirection(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].direction"));
			boundingBoxesItem.setTableId(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].tableId"));
			boundingBoxesItem.setTableCellId(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].tableCellId"));
			boundingBoxesItem.setTranslation(_ctx.mapValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].translation"));

			UpLeft upLeft = new UpLeft();
			upLeft.setX(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].upLeft.x"));
			upLeft.setY(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].upLeft.y"));
			boundingBoxesItem.setUpLeft(upLeft);

			UpRight upRight = new UpRight();
			upRight.setX(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].upRight.x"));
			upRight.setY(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].upRight.y"));
			boundingBoxesItem.setUpRight(upRight);

			DownLeft downLeft = new DownLeft();
			downLeft.setX(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].downLeft.x"));
			downLeft.setY(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].downLeft.y"));
			boundingBoxesItem.setDownLeft(downLeft);

			DownRight downRight = new DownRight();
			downRight.setX(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].downRight.x"));
			downRight.setY(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.boundingBoxes["+ i +"].downRight.y"));
			boundingBoxesItem.setDownRight(downRight);

			boundingBoxes.add(boundingBoxesItem);
		}
		translation.setBoundingBoxes(boundingBoxes);

		List<TableInfosItem> tableInfos = new ArrayList<TableInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageTranslateTaskResponse.data.translation.tableInfos.Length"); i++) {
			TableInfosItem tableInfosItem = new TableInfosItem();
			tableInfosItem.setTableId(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].tableId"));
			tableInfosItem.setXCellSize(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].xCellSize"));
			tableInfosItem.setYCellSize(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].yCellSize"));

			List<CellInfosItem> cellInfos = new ArrayList<CellInfosItem>();
			for (int j = 0; j < _ctx.lengthValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos.Length"); j++) {
				CellInfosItem cellInfosItem = new CellInfosItem();
				cellInfosItem.setTableCellId(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].tableCellId"));
				cellInfosItem.setText(_ctx.stringValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].text"));
				cellInfosItem.setXsc(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].xsc"));
				cellInfosItem.setXec(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].xec"));
				cellInfosItem.setYsc(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].ysc"));
				cellInfosItem.setYec(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].yec"));

				List<PosItem> pos = new ArrayList<PosItem>();
				for (int k = 0; k < _ctx.lengthValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].pos.Length"); k++) {
					PosItem posItem = new PosItem();
					posItem.setX(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].pos["+ k +"].x"));
					posItem.setY(_ctx.longValue("GetImageTranslateTaskResponse.data.translation.tableInfos["+ i +"].cellInfos["+ j +"].pos["+ k +"].y"));

					pos.add(posItem);
				}
				cellInfosItem.setPos(pos);

				cellInfos.add(cellInfosItem);
			}
			tableInfosItem.setCellInfos(cellInfos);

			tableInfos.add(tableInfosItem);
		}
		translation.setTableInfos(tableInfos);
		data.setTranslation(translation);
		getImageTranslateTaskResponse.setData(data);
	 
	 	return getImageTranslateTaskResponse;
	}
}