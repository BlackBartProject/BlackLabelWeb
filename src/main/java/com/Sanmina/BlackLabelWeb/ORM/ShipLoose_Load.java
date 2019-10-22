package com.Sanmina.BlackLabelWeb.ORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor	
@AllArgsConstructor
@Entity
@Table(name="tb_ShipLoose_Load", schema="dbo", catalog="db_PakingSheet")
public class ShipLoose_Load {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "[pk_id]")
	private Integer pkId;
	@Column(name = "[id]")
	private Integer id;
	@Column(name = "[order]")
	private String order;
	@Column(name = "[CustomerPO]")
	private String customerPO;
	@Column(name = "[Line]")
	private String line;
	@Column(name = "[OrderedItem]")
	private String orderedItem;
	@Column(name = "[ItemDescription]")
	private String itemDescription;
	@Column(name = "[Qty]")
	private Integer qty;
	@Column(name = "[Status]")
	private String status;
	@Column(name = "[UnitSelling]")
	private String unitSelling;
	@Column(name = "[LineType]")
	private String lineType;
	@Column(name = "[QTYCancelled]")
	private String qtyCancelled;
	@Column(name = "[QTYFulfilled]")
	private String qtyFulfilled;
	@Column(name = "[ListPrice]")
	private String listPrice;
	@Column(name = "[ExtendedPrice]")
	private String extendedPrice;
	@Column(name = "[RequestDate]")
	private String requestDate;
	@Column(name = "[PromiseDate]")
	private String promiseDate;
	@Column(name = "[SceduleArrival]")
	private String sceduleArrival;
	@Column(name = "[warehosue]")
	private String warehosue;
	@Column(name = "[ShipToLocation]")
	private String shipToLocation;
	@Column(name = "[BillToLocation]")
	private String billToLocation;
	@Column(name = "[DeliverTo]")
	private String deliverTo;
	@Column(name = "[ShipLoose]")
	private String shipLoose;
	@Column(name = "[ReturnReference]")
	private String returnReference;
	@Column(name = "[Enable]")
	private boolean enable;
	@Column(name = "[Enable_Delete]")
	private String enableDelete;
	@Column(name = "[Orden_Restante]")
	private Integer ordenRestante;
	@Column(name = "[Qty_Label_Restante]")
	private String qtyLabelRestante;
	@Column(name = "[Customer_POLine]")
	private String customerPOLine;
	@Column(name = "[kiting_qty]")
	private String kitingQty;
	@Column(name = "[Liberado]")
	private Integer liberado;
	
	
	
}
